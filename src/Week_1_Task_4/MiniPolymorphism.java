package Week_1_Task_4;

class Person2 {
    private String name;
    private int age;

    Person2(String name, int age) {
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

    public void work() {
        System.out.println("Working on something somewhere!");
    }
}

class Student2 extends Person1 {
    private String classYear;

    Student2(String name, int age, String classYear) {
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

    public void work() {
        System.out.println("Studying programming in a computer lab!");
    }
}

class Employee2 extends Person1 {
    private double salary;

    Employee2(String name, int age, double salary) {
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

    public void work() {
        System.out.println("Working as a software engineer in IT company!");
    }
}

public class MiniPolymorphism {
    public static void main(String[] args) {

        System.out.println();
        Person2 p1 = new Person2("moshin", 50);
        Student2 s1 = new Student2("samiullah khan", 28, "Fourth Year (Senior)");
        Employee2 e1 = new Employee2("sabir hussain", 38, 960000);

        p1.work();
        s1.work();
        e1.work();
    }
}
