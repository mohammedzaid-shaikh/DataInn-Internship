package Week_1_Task_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Task2Read {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("org.postgresql.Driver");

            String url = "jdbc:postgresql://localhost:5432/internshipday1";
            String user = "postgres";
            String password = "12345";

            conn = DriverManager.getConnection(url, user, password);
            System.out.println("PostgreSQL Database Connected!\n");

            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM faculty");

            while (rs.next()) {
                int facultyId = rs.getInt("faculty_id");
                String facultyName = rs.getString("faculty_name");
                int deptId = rs.getInt("dept_id");

                System.out.println(facultyId + " | " + facultyName + " | " + deptId);
            }

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

            System.out.println("\nAll Created Objects Closed.");

        }

    }
}
