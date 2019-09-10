public class PaintByStars_5_3 {
    public static void main(String[] args) {
        int x = 3;
        int y = 2;
        String star = "*";
        String starArr[][] = new String[x][y];
        for (int i = 0; i <x; i++) {
            starArr[0][i] = star;
            System.out.print(starArr[0][i]+"\t");
            for (int j = 0; j < y; j++) {
                starArr[i][j] = star;
                System.out.print(starArr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
