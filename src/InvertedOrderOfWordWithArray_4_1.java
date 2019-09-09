public class InvertedOrderOfWordWithArray_4_1 {
    public static void main(String[] args) {
        String word = "java";
        char[] result = word.toCharArray();
        for (int i = result.length - 1; i >= 0; i--)
            System.out.print(result[i]);
    }
}
