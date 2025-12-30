package Week_1_Task_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class Student4 {
    private Connection conn;

    Student4() throws Exception, SQLException {
        // Class.forName("org.postgresql.Driver");
        Class.forName("org.postgresql.Driver");

        // String url = "jdbc:postgresql://localhost:5432/internship_day1";
        conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/internship_day1",
                "postgres",
                "12345"
        );
        System.out.println("PostgresSQL Database Connected!");
    }

    public void insertStudent(String newName, int newAge) throws SQLException {
        String query = "INSERT INTO students_oop (student_name, student_age) VALUES (?, ?)";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, newName);
        ps.setInt(2, newAge);
        ps.executeUpdate();
        System.out.println("Inserted [ Name: \"" + newName + "\", Age: " + newAge + " ].");
    }

    public void getAllStudents() throws Exception, SQLException {
        String query = "SELECT * FROM students_oop";
        PreparedStatement ps = conn.prepareStatement(query);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            int student_id = rs.getInt("student_id");
            String student_name = rs.getString("student_name");
            int student_age = rs.getInt("student_age");

            System.out.println(student_id + " | " + student_name + " | " + student_age + " | ");
        }
    }

    public void updateStudent(int student_id, String newName, int newAge) throws Exception, SQLException {
        String query = "UPDATE students_oop SET student_name = ?, student_age = ? WHERE student_id = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, newName);
        ps.setInt(2, newAge);
        ps.setInt(3, student_id);
        ps.executeUpdate();
        System.out.println("Updated student with [ student_id = " + student_id + " ]");
    }

    public void deleteStudent(int student_id) throws Exception, SQLException {
        String query = "DELETE FROM students_oop WHERE student_id = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, student_id);
        ps.executeUpdate();
        System.out.println("Deleted student with [ student_id = " + student_id + " ]");
    }
}

public class StudentCRUD {
    public static void main(String[] args) throws Exception, SQLException {
        Student4 s1 = new Student4();

        System.out.println();

        // Insert Operations
        s1.insertStudent("zaid shaikh", 21);
        s1.insertStudent("Sakib khan", 21);
        s1.insertStudent("shanwaz lallanwa", 21);

        System.out.println("-----------------------------------------------------");

//         Select All Operation
        s1.getAllStudents();

        System.out.println("-----------------------------------------------------\n");

        s1.updateStudent(13, "hassan shaikh", 21);
        s1.updateStudent(14, "toufik khan", 22);

        System.out.println("-----------------------------------------------------");

        s1.getAllStudents();

        System.out.println("-----------------------------------------------------\n");

        s1.deleteStudent(13);
        s1.deleteStudent(14);

        System.out.println("-----------------------------------------------------");

        s1.getAllStudents();

        System.out.println("-----------------------------------------------------\n");

    }
}
