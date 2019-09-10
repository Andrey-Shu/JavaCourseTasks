public class PolindromeWordVerify_4_6 {
    public static void main(String[] args) {
        String word = new String();
        word = ("qweewq1");
        String newWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            newWord += word.charAt(i);
           }
       if (word.endsWith(newWord)) {
         System.out.println("Polindome");
       } else System.out.println("not Polindome");
    }
}
