public class inverted_traingle {
    public static void main(String[] args) {
        inverted(5);
    }

    static void inverted(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.println("* ");
            }
            System.out.println();
        }
    }
}
