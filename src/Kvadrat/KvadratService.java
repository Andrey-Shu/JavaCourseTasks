package Kvadrat;

public class KvadratService {

    public static int perimetrCalculation(Kvadrat kvadrat) {
        int perimetr;
        perimetr = kvadrat.getSideSquqreA() * 4;
        return perimetr;
    }

    public static int squareAreaCalculation(Kvadrat kvadrat) {
        int square;
        square = kvadrat.getSideSquqreA() * kvadrat.getSideSquqreA();
        return square;
    }

    public static int sumOfPerimeters (Kvadrat[] kvadratArr){
        int sumPerimetrs=0;
        for (int i = 0; i<kvadratArr.length; i++){
           sumPerimetrs += perimetrCalculation(kvadratArr[i]);
        }
        return sumPerimetrs;
    }



}
