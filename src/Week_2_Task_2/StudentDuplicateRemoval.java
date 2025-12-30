package Week_2_Task_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.lang.Object;
import java.util.Objects;

class Student {
    private int id;
    private String name;
    private String course;

    public Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    // No setter functions implemented because we don't want to add any updating functionality to the object.

    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj; // Type casting:
        return (Objects.equals(id, s.id) && Objects.equals(name, s.name) && Objects.equals(course, s.course));
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, course);
    }

    @Override
    public String toString() {
        return "[ ID: " + getId() + ", Name: " + getName() + ", Course: " + getCourse() + " ]\n";
    }
}

public class StudentDuplicateRemoval {
    public static void main(String[] args) {
        ArrayList<Student> studArrList = new ArrayList<>();

        studArrList.add(new Student(302, "sakib", "Computer Science"));
        studArrList.add(new Student(303, "fatima", "Art and Craft"));
        studArrList.add(new Student(304, "zaid", "Psychology"));
        studArrList.add(new Student(305, "sakib", "Computer Science"));
        studArrList.add(new Student(306, "zaid", "Psychology"));

        System.out.println("\nDuplicates: \n" + studArrList );

        HashSet<Student> studHashList = new HashSet<>(studArrList);

        System.out.println("\nUnique: \n" + studHashList);
    }
}
