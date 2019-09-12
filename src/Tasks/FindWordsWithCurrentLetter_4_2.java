package Tasks;

public class FindWordsWithCurrentLetter_4_2 {
    public static void main(String[] args) {
        String letter = "q";
        String str = "qwe qwr trf dfsq q fdsdf  fddd asd";
        String separator = "\\s+";
        String[] sepString = str.split(separator);
        for (int i = 0; i < str.split(separator).length; i++)
            if (sepString[i].contains(letter)) {
                System.out.println(sepString[i]);
            }
    }
}
