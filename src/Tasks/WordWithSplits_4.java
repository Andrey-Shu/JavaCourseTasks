package Tasks;

public class WordWithSplits_4 {
    public static void main(String[] args) {
        String word = "word";
        System.out.println("word = " + word);
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            System.out.printf(ch+"_");
        }
    }
}
