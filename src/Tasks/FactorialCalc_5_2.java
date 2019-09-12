package Tasks;

import java.util.Scanner;

public class FactorialCalc_5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number for factorial calculation = ");
        int factorial = 1;
        int number = scanner.nextInt();
        for (int i = 1; i < number; i++) {
            factorial = factorial * (i + 1);
        }
        System.out.println("Factorial " + number + "! = " + factorial);
    }
}
