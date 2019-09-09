public class CreateArrayWithOddNumbersInInvertedOrder_4_3 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        for (int i = 0; 0 < numbers.length + 1; i++) {
            numbers[i] = i + 1;
            if (numbers[i] % 2 == 0)
                System.out.println(numbers[i]);
        }
    }
}
