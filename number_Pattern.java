package Practice;

public class number_Pattern {
    public static void main(String[] args) {
        numberPatter(5);
    }

    static void numberPatter(int n) {
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.println(col + " ");
            }
            System.out.println(" ");
        }
    }
}
