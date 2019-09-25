package CollectionTaskWithNumbers;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionMainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numberList = new ArrayList();

        double sum;
        do {
             sum = 0;
            System.out.println("Input number = ");
            double num = scanner.nextInt();
            numberList.add(num);
            for (int i = 0; i < numberList.size(); i++) {
                sum += numberList.get(i);
                System.out.println("sum_array=" + sum);
                System.out.println("number = " + numberList);

            }
        }
        while (sum <= 1000);
        System.out.println("sum > 1000");
    }

}

