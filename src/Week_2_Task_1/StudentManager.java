package Week_2_Task_1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {

    private ArrayList<Student> list = new ArrayList<>();

    // Add Student
    public void addStudent(Student s) {
        list.add(s);
        System.out.println("Student added successfully!");
    }

    // Display All Students
    public void showStudents() {
        if (list.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student s : list) {
            System.out.println(s);
        }
    }

    // Search Student by ID
    public Student searchStudent(int id) {
        for (Student s : list) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    // Update Student
    public void updateStudent(int id, String newName, String newCourse) {
        Student s = searchStudent(id);

        if (s == null) {
            System.out.println("Student not found!");
            return;
        }

        s.setName(newName);
        s.setCourse(newCourse);
        System.out.println("Student updated successfully!");
    }

    // Delete Student
    public void deleteStudent(int id) {
        Student s = searchStudent(id);

        if (s == null) {
            System.out.println("Student not found!");
            return;
        }

        list.remove(s);
        System.out.println("Student deleted successfully!");
    }


    public static void main(String[] args) {

        StudentManager sm = new StudentManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== STUDENT MANAGEMENT MENU =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch (choice) {

                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = Integer.parseInt(sc.nextLine());

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Student Course: ");
                    String course = sc.nextLine();

                    sm.addStudent(new Student(id, name, course));
                    break;

                case 2:
                    sm.showStudents();
                    break;

                case 3:
                    System.out.print("Enter ID of student to update: ");
                    int uid = Integer.parseInt(sc.nextLine());

                    System.out.print("Enter new Name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter new Course: ");
                    String newCourse = sc.nextLine();

                    sm.updateStudent(uid, newName, newCourse);
                    break;

                case 4:
                    System.out.print("Enter ID of student to delete: ");
                    int did = Integer.parseInt(sc.nextLine());

                    sm.deleteStudent(did);
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}

