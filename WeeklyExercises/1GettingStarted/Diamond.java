public class Diamond {
    public static void main(String[] args) {
        int rows = 7, odd = 1, spaces = rows/2;
        for (int i = 1; i <= rows; i++) {
            for (int k = spaces; k >= 1; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= odd; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i < rows/2+1) {
                odd += 2;
                spaces -= 1;
            } else {
                odd -= 2;
                spaces += 1;
            }
        }
    }
}
