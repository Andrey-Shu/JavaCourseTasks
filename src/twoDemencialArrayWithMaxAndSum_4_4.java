import java.util.Random;

public class twoDemencialArrayWithMaxAndSum_4_4 {
    public static void main(String[] args) {
        Random random = new Random();
        int y = 4;
        int x = 4;
        int[][] intArray = new int[x][y];
        int maxValue = 0;
        int sum = 0;
        System.out.println("Matrix: ");
        for (int i = 0; i < x; i++) {

            int num = random.nextInt(100);
            intArray[0][i] = num;
            for (int j = 0; j < y; j++) {
                 num = random.nextInt(100);
                intArray[i][j] = num;
                System.out.print(intArray[i][j]+"\t");
                sum = sum + intArray[i][j];
                if (intArray[i][j]>maxValue){
                    maxValue =intArray[i][j];
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Max value = " + maxValue);
        System.out.println();
        System.out.println("Sum = " + sum);
    }
}
