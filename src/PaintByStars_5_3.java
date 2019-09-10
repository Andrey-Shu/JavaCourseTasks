public class PaintByStars_5_3 {
    public static void main(String[] args) {
        int x = 3;
        int y = 1;
        String star = "*";
        for (int i = 0; i <x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(star+"\t");
            }
            System.out.println();
        }
    }
}
