package Week_1_Task_4;

class Person1 {
    private String name;
    private int age;

    Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return name;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public int getAge() {
        return age;
    }

    public void displayPerson() {
        System.out.println("\nName: " + name + "\nAge: " + age);
    }

}

class Student1 extends Person1 {
    private String classYear;

    Student1(String name, int age, String classYear) {
        super(name, age);
        this.classYear = classYear;
    }

    public void setClassYear(String newClass) {
        this.classYear = newClass;
    }

    public String getClassYear() {
        return classYear;
    }

    public void displayStudent() {
        super.displayPerson();
        System.out.println("Current Class Year: " + classYear);
    }
}

class Employee1 extends Person1 {
    private double salary;

    Employee1(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public void setSalary(double newSal) {
        this.salary = newSal;
    }

    public double getSalary() {
        return salary;
    }

    public void displayEmployee() {
        super.displayPerson();
        System.out.println("Salary: " + salary);
    }
}

public class MiniInheritance {
    public static void main(String[] args) {

        Student1 s1 = new Student1("samiullah khan", 20, "Fourth Year (Senior)");
        Employee1 e1 = new Employee1("sabir hussain", 27, 980000);

        s1.displayStudent();
        e1.displayEmployee();
    }
}
