package BTJAVABASIC5;

public class Employee {
    int id;
    String name;
    int age;
    String dept;

    public Employee(int id, String name, int age, String dept) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + age + " - " + dept;
    }
}
