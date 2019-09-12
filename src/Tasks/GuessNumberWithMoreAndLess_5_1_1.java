package Tasks;

import java.util.Random;
import java.util.Scanner;

import static com.sun.tools.doclint.Entity.or;

public class GuessNumberWithMoreAndLess_5_1_1 {
    public static void main(String[] args) {
        Random random = new Random();
        int guessedNumber = random.nextInt(10);
        System.out.println(guessedNumber);
        Scanner sc = new Scanner(System.in);
        int inputNumber;

        do {
            System.out.print("input number = ");
            inputNumber = sc.nextInt();
            if (guessedNumber != inputNumber) {
                if (guessedNumber > inputNumber) {
                    System.out.println("Number is bigger");
                } else System.out.print("Number is less");
            }
        } while (guessedNumber != inputNumber);
            System.out.println("You guessed!");
    }

}
