package Practice.Patterns;

public class pattern1 {
    public static void main(String[] args) {
        pattern1(5);
    }

    static void pattern1(int n) {
        // Outer Loop will run
        for (int row = 1; row < n; row++) {
            // For every row run the columns
            for (int col = 1; col <= row; col++) {
                System.out.println("*");
            }
            // When one row is printed then we need to print it in new line
            System.out.println();
        }
    }
}