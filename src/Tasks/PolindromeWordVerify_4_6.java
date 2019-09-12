package Tasks;

public class PolindromeWordVerify_4_6 {
    public static void main(String[] args) {
        String word = "qweewq";
        String newWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            newWord += word.charAt(i);
           }
       if (word.equals(newWord)) {
         System.out.println("Polindome");
       } else System.out.println("not Polindome");
    }
}
