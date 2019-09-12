package Tasks;

public class StrindBuilberExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i =0;i<10;i++){
            sb.append(i);
        }
        sb.append("test string");
        sb.append(" test string");
        sb.toString();
        System.out.println(sb.toString());
    }
}
