package ChotkiyStaff;

import java.util.List;

public class Company {
    private  List<Employee> staff;
    private String companyName;

    public List<Employee> getStaff() {
        return staff;
    }

    public void setStaff(List<Employee> staff) {
        this.staff = staff;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Company{" +
                "staff=" + staff +
                ", companyName='" + companyName + '\'' +
                '}';
    }


}
