package Week_1_Task_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Task3CRUD {
    public static void main(String[] args) {

        String baseUrl = "jdbc:postgresql://localhost:5432/";
        String user = "postgres";
        String password = "12345";

        String newDB = "tempdb";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("org.postgresql.Driver");

            // Connecting to "postgres" which is the system default database
            conn = DriverManager.getConnection(baseUrl + "postgres", user, password);
            System.out.println("\n1.] Connected to postgres database.");


            // Creating a program temporary database named "tempdb"
            stmt = conn.createStatement();
            stmt.executeUpdate("CREATE DATABASE " + newDB);
            System.out.println("\n2.] Database '" + newDB + "' created.");


            // Closing connection with "postgres" database
            stmt.close();
            conn.close();


            // Establishing connection with "tempdb" database
            conn = DriverManager.getConnection(baseUrl + newDB, user, password);
            System.out.println("\n3.] Connected to temporary database '" + newDB + "'.");


            // Create Table Command
            String createTable = "CREATE TABLE faculty (faculty_id SERIAL PRIMARY KEY, faculty_name VARCHAR(50), dept_name VARCHAR(100));";


            stmt = conn.createStatement();
            stmt.executeUpdate(createTable);
            System.out.println("\n4.] Table 'faculty' created.");


            // Inserting rows into the table created
            stmt.executeUpdate("INSERT INTO faculty (faculty_name, dept_name) VALUES ('Yunus Bagewadi', 'Computer Science')");
            stmt.executeUpdate("INSERT INTO faculty (faculty_name, dept_name) VALUES ('Sangram Rajput', 'Commerce')");
            stmt.executeUpdate("INSERT INTO faculty (faculty_name, dept_name) VALUES ('Eshaan Naik', 'Mathematics')");

            System.out.println("\n5.] Sample data inserted into 'faculty'.\n");


            // Displaying data of the table created
            rs = stmt.executeQuery("SELECT * FROM faculty");

            System.out.println("------------------------------------");
            System.out.println("faculty_id | faculty_name | dept_name");
            System.out.println("------------------------------------");

            while (rs.next()) {
                int facultyId = rs.getInt("faculty_id");
                String facultyName = rs.getString("faculty_name");
                String deptName = rs.getString("dept_name");

                System.out.println(facultyId + " | " + facultyName + " | " + deptName + " | ");
            }

            System.out.println("------------------------------------");


            // Drop/Delete the table
            stmt.executeUpdate("DROP TABLE faculty");
            System.out.println("\n6.] Table 'faculty' DELETED!");


            // Closing connection with "tempdb" database
            stmt.close();
            conn.close();


            // Switching back to "postgres" database and dropping "tempdb" database
            conn = DriverManager.getConnection(baseUrl + "postgres", user, password);
            stmt = conn.createStatement();
            stmt.executeUpdate("DROP DATABASE " + newDB);
            System.out.println("7.] Database '" + newDB + "' DELETED!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            System.out.println("\n8.] All JDBC Objects Closed.");
        }
    }
}
