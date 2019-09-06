import java.util.Arrays;

public class CountOfLetters {
    public static void main(String[] args) {
        String text = "qwerqw    eqwer  asdfsdf   ";
        String newText = text.replace(" ", "");
        System.out.println("text= "+ newText);
        int countOfLetters = newText.length();
        System.out.println(countOfLetters);
    }
}
