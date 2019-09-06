public class WordWithSplits {
    public static void main(String[] args) {
        String word = "qwerqwnnnn";
        System.out.println("word = " + word);
        int index = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(index);
            System.out.printf(ch+"*");
            index++;
        }
    }
}
