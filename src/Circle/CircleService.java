package Circle;

import java.util.Random;

public class CircleService {
    static Random random = new Random();

    public static double circleSquare(Circle circle) {
        double r = circle.getRadius();
        double circleS = Math.PI * Math.pow(r, 2);
        return circleS;
    }

    public static Circle createCircle(double r) {
        return new Circle(r);
    }

    public static Circle[] createArrayCircles(int numOfCircles) {
        Circle circles[] = new Circle[numOfCircles];
        for (int i = 0; i < numOfCircles; i++) {
            Circle circle = createCircle(random.nextInt(10));
            circles[i] = circle;
        }
        return circles;
    }

    public static Circle getBiggerCircle(Circle c1, Circle c2) {
        double s1 = circleSquare(c1);
        double s2 = circleSquare(c2);
        if (s1 > s2) {
            return c1;
        }
        return c2;
    }

    public static Circle getSmollerCircle(Circle[] circles) {
        Circle circle = circles[0];
        double sMin = circleSquare(circle);

        for (int i = 1; i < circles.length; i++) {
            double s = circleSquare(circles[i]);

            if (s <= sMin) {
                sMin = s;
                circle = circles[i];
            }
        }
        System.out.println("S min = " + sMin);
        return circle;
    }


    public static Circle getSumOfCircles(Circle[] circles) {
        double sumOfCircles = 0;
        Circle circle = circles[0];
        for (int i = 0; i < circles.length; i++) {
            double s = circleSquare(circles[i]);
            sumOfCircles = sumOfCircles + s;
            System.out.println(sumOfCircles);
        }
        System.out.println("sum=" + sumOfCircles);
        return circle;
    }
}
