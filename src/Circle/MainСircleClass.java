package Circle;

import java.util.Arrays;
import java.util.Scanner;

public class MainСircleClass {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ////------------------- A
//        System.out.print("Input radius = ");
//        double r = sc.nextInt();
//        Circle circle = new Circle(r);
//        double s = CircleService.circleSquare(circle);
//        System.out.println("circle S = " + s);
        ////-------------------

        ////------------------- B
//        System.out.print("Input radius = ");
//        double r = sc.nextInt();
//        Circle s = CircleService.crateCircle(r);
//        System.out.println("circle S = " + s);
        ////-------------------

        ////------------------- C
//        System.out.print("Input count of circles = ");
//        int numOfCircles = sc.nextInt();
//        Circle s[] = CircleService.createArrayCircles(numOfCircles);
//        System.out.println(Arrays.toString(s));
        ////-------------------

        ////------------------- D
//        System.out.print("Input radius = ");
//        double r = sc.nextInt();
//        Circle circle = new Circle(r);
//        double s = CircleService.circleSquare(circle);
//        System.out.println("circle S = " + s);

        ////-------------------
//        Circle c1 = new Circle(7);
//        Circle c2 = new Circle(7);
//        System.out.println(CircleService.getBiggerCircle(c1,c2));
        ////-------------------

        ////------------------- E
//        System.out.println("Input count of circles = ");
//        int countOfCircles = sc.nextInt();
//        Circle circles[] = CircleService.createArrayCircles(countOfCircles);
//        Circle minCercle = CircleService.getSmollerCircle(circles);
//        System.out.println(minCercle);
        ////-------------------
        System.out.println("Input count of circles = ");
        int countOfCircles = sc.nextInt();
        Circle circles[] = CircleService.createArrayCircles(countOfCircles);
        Circle sum = CircleService.getSumOfCircles(circles);
    }

}

