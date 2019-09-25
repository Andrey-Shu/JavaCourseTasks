package Rectangle;

import java.util.Scanner;

public class MainRactangleClass {

    private static Scanner sc = new Scanner(System.in);
    private static int A;
    private static int B;


    public static void main(String[] args) {

        System.out.println("select 1 = S");
        System.out.println("select 2 = P");
        System.out.println("select 3 = diagonal");
        System.out.println("select 4 = diff S");
        System.out.println("-----------------");
        System.out.print("your choose = ");
        int choosenumber = sc.nextInt();
        System.out.println("-----------------");
        switch (choosenumber) {
            case 1:
                int s = RectangleService.regtangleSquare(chooseSides());
                System.out.println("S regtangle = " + s);
                break;

            case 2:
                int p = RectangleService.regtanglePerim(chooseSides());
                System.out.println("P regtange = " + p);
                break;

            case 3:
                double diagReg = RectangleService.diagonalRectangle(chooseSides());
                System.out.println("diagonal regtange = " + diagReg);
                break;
            case 4:
                System.out.println("input A and B sides for first regtangle");
                int s1 = RectangleService.regtangleSquare(chooseSides());
                System.out.println("input A and B sides for second regtangle");
                int s2 = RectangleService.regtangleSquare(chooseSides());
                int result = s1 - s2;
                System.out.println("diff reg = " + result);
                break;

        }
        System.out.println("test");
    }



    public static Rectangle chooseSides() {
        System.out.print("input side A = ");
        int A = sc.nextInt();
        System.out.print("input side B = ");
        int B = sc.nextInt();
        return new Rectangle(A, B);
    }
}
