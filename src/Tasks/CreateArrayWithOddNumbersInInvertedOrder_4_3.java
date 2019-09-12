package Tasks;

public class CreateArrayWithOddNumbersInInvertedOrder_4_3 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        int[] result = new int[100];
        for (int i = 0; i < 99; i++) {
            numbers[i] = i + 1;
            if (numbers[i] % 2 == 0) {
                result[i] = numbers[i];
                //              System.out.println(result[i]);
            }
        }
        for (int j = result.length - 1; j >= 0; j--)
            if (result[j] > 0) {
                System.out.println(result[j]);
            }
    }
}
