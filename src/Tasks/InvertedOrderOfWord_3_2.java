package Tasks;

public class InvertedOrderOfWord_3_2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("java");
        for (int i = sb.length()-1; i >=0; i--) {
            System.out.print(sb.charAt(i));
        }
    }
}
