package BTJAVABASIC5;

import java.util.ArrayList;

public class EmployeeList {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee(1,"Huy",25,"IT"));
        list.add(new Employee(2,"Hùng",30,"HR"));
        list.add(new Employee(3,"Cường",40,"BA"));
        list.add(new Employee(4,"Nam",45,"PM"));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
