package Week_1_Task_4;

class Student {

    private String name;
    private int rollNumber;
    private int standard;
    private String board;
    private double marks;
    private int age;


    public Student(String name, int rollNumber, int standard, String board, double marks, int age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.standard = standard;
        this.board = board;
        this.marks = marks;
        this.age = age;
    }


    public String getName() {
        return name;

    }
    public void setName(String name) {
        this.name = name;
    }


    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }


    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }


    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }


    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String calculateGrade() {
        if (marks >= 90) return "A+";
        else if (marks >= 75) return "A";
        else if (marks >= 60) return "B";
        else if (marks >= 50) return "C";
        else if (marks >= 35) return "D";
        else return "F";
    }


    public boolean isPass() {
        return marks >= 35;
    }


    public boolean isEligibleForExam() {
        return standard >= 10; // Board exams start from class 10
    }


    @Override
    public String toString() {
        return "Student {\n\tname = '" + name + "', \n\trollNumber = " + rollNumber +
                ", \n\tstandard = " + standard + ", \n\tboard = '" + board + "'" +
                ", \n\tmarks = " + marks + ", \n\tage = " + age +
                ", \n\tgrade = " + calculateGrade() +
                ", \n\teligibleForExam = " + isEligibleForExam() + "\n}";
    }
}


public class SimpleStudentClass {
    public static void main(String[] args) {
        // Student(String name, int rollNumber, int standard, String board, double marks, int age)
        Student st = new Student("fatima sayyed", 302, 12, "Higher Secondary School", 65, 17);
        System.out.println(st.calculateGrade());
        System.out.println(st);
    }
}
