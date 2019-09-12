package Tasks;

public class CountOfWords {
    public static void main(String[] args) {
        String text = "qwerqw    eqwer  asdfsdf   ";
        String separator = "\\s+";
        String[] stringArray = text.split(separator);
        System.out.println(" count Of Words= " + stringArray.length);
    }
}
