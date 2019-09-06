public class EqualLetters {
    public static void main(String[] args) {
        String word = "qwerqwnn nn";
        System.out.println("word = " + word);
        int countOfLetters = word.length();
        System.out.println("countOfLetters= "+ countOfLetters);
        if (countOfLetters == 10){
            System.out.println("true");
        } else
        System.out.println("false");
    }
}
