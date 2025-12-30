package Week_1_Task_4;

class Person {
    private String name;
    private int age;

    Person(String name, int age) {
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

public class MiniEncapsulation {
    public static void main(String[] args) {

        Person p1 = new Person("samiullah khan", 50);
        p1.displayPerson();

        p1.setName("sabir hussain");
        p1.setAge(25);

        p1.displayPerson();
    }
}
