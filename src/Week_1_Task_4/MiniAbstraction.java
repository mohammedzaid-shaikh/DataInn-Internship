package Week_1_Task_4;

interface ClassBehaviour {
    public void displayClass();
    public void work();
}

class Student3 implements ClassBehaviour {
    private String name;
    private int age;
    private String classYear;

    Student3(String name, int age, String classYear) {
        this.name = name;
        this.age = age;
        this.classYear = classYear;
    }

    public void setClassYear(String newClass) {
        this.classYear = newClass;
    }

    public String getClassYear() {
        return classYear;
    }

    public void displayClass() {
        System.out.println("\nName: " + name + "\nAge: " + age);
        System.out.println("Current Class Year: " + classYear);
    }

    public void work() {
        System.out.println("Studying programming in a computer lab!");
    }
}

public class MiniAbstraction {
    public static void main(String[] args) {
        Student3 s1 = new Student3("muzamil", 21, "Fourth Year (Senior)");

        s1.displayClass();
        s1.work();
    }
}
