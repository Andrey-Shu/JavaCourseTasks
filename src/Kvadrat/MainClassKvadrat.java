package Kvadrat;

import java.util.Random;
import java.util.Scanner;

public class MainClassKvadrat {
    public  static void main(String[] args) {
        Kvadrat kvadrat = new Kvadrat(5);
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("select 1 = P");
        System.out.println("select 2 = S");
        System.out.println("select 3 = sumP");
        System.out.println("select 4 = sumP with input count of square(s)");
        System.out.println("--------------");
        System.out.print("your choose = ");
        int chooseNumber = sc.nextInt();
        System.out.println("--------------");

        switch (chooseNumber) {
            case 1:
                int p = KvadratService.perimetrCalculation(kvadrat);
                System.out.println("perimetr of square with side = " + kvadrat.getSideSquqreA() + " equal = " + p);
                break;
            case 2:
                int s = KvadratService.squareAreaCalculation(new Kvadrat(5));
                System.out.println("square of area with side = " + kvadrat.getSideSquqreA() + " equal = " + s);
                break;
            case 3:
                Kvadrat arr[] = new Kvadrat[3];
                arr[0]=new Kvadrat(6);
                arr[1]=new Kvadrat(7);
                arr[2]=new Kvadrat(8);
                int sumPerim = KvadratService.sumOfPerimeters(arr);
                System.out.println("summ of perimeters = " + sumPerim);
            case 4:
                System.out.print("input count of square = ");
                int countSquare = sc.nextInt();
                Kvadrat arrIn[] = new Kvadrat[countSquare];
                for (int i = 0; i<arrIn.length; i++){
                    int side = random.nextInt(10);
                    System.out.println("side " + (i+1) +" = " + side);
                    arrIn[i] = new Kvadrat(side);
                }
                int sumPerimInputedCountSquares = KvadratService.sumOfPerimeters(arrIn);
                System.out.println("summ of perimeters = " + sumPerimInputedCountSquares);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + chooseNumber);
        } return;
    }
}
