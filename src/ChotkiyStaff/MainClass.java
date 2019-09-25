package ChotkiyStaff;

import java.util.List;

public class MainClass {
    public static void main(String[] args) {
//        EmployeeFactory employeeFactory = new EmployeeFactory();
       List<Employee> emp= EmployeeFactory.createEmployee(3);
//        System.out.println(String.join("\\n"+ emp));
        System.out.println(emp);

    }
}
