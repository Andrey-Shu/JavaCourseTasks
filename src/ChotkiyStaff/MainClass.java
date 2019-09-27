package ChotkiyStaff;

import org.omg.CORBA.DATA_CONVERSION;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.SortedMap;

public class MainClass {
    public static void main(String[] args) throws Exception {
//        EmployeeFactory employeeFactory = new EmployeeFactory();
        List<Employee> staff = EmployeeFactory.createEmployee(10);
        printStaff(staff);
        System.out.println("===================================================");
        Company company = new Company();
        company.setStaff(staff);
        company.setCompanyName("DA");
        CompanyService companyService = new CompanyService(company);
        int count = companyService.getCountOfEmpl();
        System.out.println("count of employees = " + count);
        System.out.println("===================================================");
        Employee newEmpl = companyService.createNewEmpl();
        staff.add(newEmpl);
        System.out.println("New empl:");
        printStaff(Collections.singletonList(newEmpl));
        System.out.println("===================================================");
        System.out.println("All staff:");
        printStaff(staff);
        System.out.println("===================================================");
        Employee firedEmpl = null;
        firedEmpl = companyService.firedEmpl(1);
        System.out.println("Fired empl: ");
        System.out.println(firedEmpl);
        System.out.println("");
        System.out.println("Staff after  dismissal:");
        printStaff(staff);
        System.out.println("===================================================");
        Employee youngEmpl = companyService.getYoungEmpl();
        System.out.println("The most younger empl: ");
        System.out.println("Name = " + youngEmpl.getName());
        System.out.println("Last name = " + youngEmpl.getLastName());
        System.out.println("Age = " + youngEmpl.getAge());
        System.out.println("===================================================");
        Employee olderEmpl = companyService.getOlderEmpl();
        System.out.println("The most older empl + hobby: ");
        System.out.println("Name = " + olderEmpl.getName());
        System.out.println("Last name = " + olderEmpl.getLastName());
        System.out.println("Age = " + olderEmpl.getAge());
        System.out.println("Hobby = " + olderEmpl.getHobbies());
        System.out.println("===================================================");
        int idEmplIsPresent = 2;
        System.out.print("Empl with id = " + idEmplIsPresent);
        Boolean emplIsPresent;
        emplIsPresent = companyService.isEmplPresentinCompany(idEmplIsPresent);
        System.out.println(" is present in company: " + emplIsPresent);
        System.out.println("===================================================");
        int idEmpl = 12;
        System.out.println("Info about employee with id=" + idEmpl);
        Employee infoEmpl = companyService.getEmpl(idEmpl);
        System.out.println(infoEmpl);
        System.out.println("===================================================");


    }

    public static void printStaff(List<Employee> staff) {
        for (Employee e : staff) {
            System.out.println(e);
        }

    }
}
