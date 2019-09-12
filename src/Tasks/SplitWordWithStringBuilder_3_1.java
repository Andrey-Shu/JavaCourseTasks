package Tasks;

public class SplitWordWithStringBuilder_3_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("word");
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            System.out.print(ch + "_");
        }
    }
}
