package ChotkiyStaff;

import java.time.LocalDate;
import java.util.List;

public class Employee {
    private  int id;
    private String name;
    private String lastName;
    private int age;
    private LocalDate birthday;
    private List<Hobbie> hobbies;

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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public LocalDate setBirthday(LocalDate birthday) {
        this.birthday = birthday;
        return birthday;
    }

    public List<Hobbie> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<Hobbie> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", birthday='" + birthday + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }
}
