package Week_1_Task_4;

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
    private String position;

    public Employee(int id, String name, String department, double salary, String position) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void giveRaise(double amount) {
        if (amount > 0) {
            this.salary += amount;
        }
    }

    public void applyRaisePercentage(double percent) {
        if (percent > 0) {
            this.salary += salary * (percent / 100.0);
        }
    }

    public void transferDepartment(String newDepartment) {
        this.department = newDepartment;
    }

    public void promote(String newPosition) {
        this.position = newPosition;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "\n\tID = " + id +
                ", \n\tName = '" + name + '\'' +
                ", \n\tDepartment = '" + department + '\'' +
                ", \n\tPosition = '" + position + '\'' +
                ", \n\tSalary = " + salary +
                "\n}";
    }
}


public class SimpleEmployeeClass {
    public static void main(String[] args) {
        // Employee(int id, String name, String department, double salary, String position)
        Employee emp1 = new Employee(103, "Zaid shaikh", "Software Development", 234522, "Senior Software Engineer");

        System.out.println(emp1);
    }
}