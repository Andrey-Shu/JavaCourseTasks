package Tasks;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber_5_1 {
    public static void main(String[] args) {
        Random random = new Random();
        int guessedNumber = random.nextInt(10);
        System.out.println(guessedNumber);
        Scanner sc = new Scanner(System.in);
        System.out.print("input number = ");
        int inputNumber = sc.nextInt();
        System.out.println("inputed number = " + inputNumber);
        if (guessedNumber == inputNumber) {
            System.out.println("You guessed!");
        } else System.out.println("Not guessed. Try again");
    }
}
