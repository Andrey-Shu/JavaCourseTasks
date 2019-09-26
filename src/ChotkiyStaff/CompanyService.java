package ChotkiyStaff;

import java.util.List;

import static com.sun.tools.internal.xjc.reader.Ring.add;

public class CompanyService {

    private Company company;


    public CompanyService(Company company) {
        this.company = company;
    }


    public int getCountOfEmpl() {
        int count = company.getStaff().size();

        return count;
    }

    public Employee createNewEmpl() {
        int countOfNewEmpl = 1;
        List<Employee> employee = EmployeeFactory.createEmployee(countOfNewEmpl);
        Employee newEmpl = employee.get(0);
        return newEmpl;
    }

    public Employee firedEmpl(int id) {
        Employee firedId = company.getStaff().remove(id - 1);
        return firedId;
    }


    public Employee getYoungEmpl() {
        Employee employee = company.getStaff().get(0);
        int minAge = employee.getAge();
        for (Employee e : company.getStaff().subList(1, company.getStaff().size())) {
            int currentAge = e.getAge();
            if (minAge >= currentAge) {
                minAge = currentAge;
                employee = e;
            }
        }
        return employee;
    }

    public Employee getOlderEmpl() {
        Employee employee = company.getStaff().get(0);
        int maxAge = employee.getAge();
        for (Employee e : company.getStaff().subList(1, company.getStaff().size())) {
            int currentAge = e.getAge();
            if (maxAge <= currentAge) {
                maxAge = currentAge;
                employee = e;
            }
        }
        return employee;
    }

    public Boolean isEmplPresentinCompany(int id) {
        for (Employee e : company.getStaff()) {
            if (e.getId() == id) {
                return true;
            }

        }
        return false;
    }


    public Employee getEmpl(int id) {
        Employee employee = new Employee();
        for (Employee e : company.getStaff().subList(0, company.getStaff().size())) {
            int currentID = e.getId();
            if (currentID == id) {
                employee = e;
            }
        }
        return employee;

    }
}


