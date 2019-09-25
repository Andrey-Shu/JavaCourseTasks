package ChotkiyStaff;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;

public class EmployeeFactory {
    static Random rand = new Random();
    private static int id = 1;

    public static List<Employee> createEmployee(int amountOfEmplyee) {
        List<Employee> staff = new ArrayList<Employee>();
        for (int i = 0; i < amountOfEmplyee; i++) {
            Employee employee = new Employee();
            employee.setId(id++);
            employee.setName(getRandomString());
            employee.setLastName(getRandomString());
            LocalDate bDay = employee.setBirthday(getRandomDate());
            employee.setAge(getCurrentYear()-bDay.getYear());
            staff.add(employee);
        }
        return staff;
    }


    public static int getCurrentYear(){
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        return currentYear;
    }

    public static String getRandomString() {
        int length = 7;
        final String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJLMNOPQRSTUVWXYZ1234567890";
        StringBuilder result = new StringBuilder();
        while (length > 0) {
            result.append(characters.charAt(rand.nextInt(characters.length())));
            length--;
        }
        return result.toString();
    }

    public static LocalDate getRandomDate() {

        int minDay = (int) LocalDate.of(1900, 1, 1).toEpochDay();
        int maxDay = (int) LocalDate.of(2000, 1, 1).toEpochDay();
        long randomDay = minDay + rand.nextInt(maxDay - minDay);
        LocalDate randomBirthDate = LocalDate.ofEpochDay(randomDay);
        return randomBirthDate;
    }
}