public class same_NumberPattern {
    public static void main(String[] args) {
        sameNo(5);
    }

    static void sameNo(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.println(row + " ");
            }
            System.out.println("");
        }
    }
}
