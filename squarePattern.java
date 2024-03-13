package Practice.Patterns;

public class squarePattern {
    public static void main(String[] args) {
        pattern2(4);
    }

    static void pattern2(int n) {
        // Step 1 : No of Lines = No of rows = No of time the outer loop will run
        // Which means say we have 4 lines
        /*
         * *****
         * *****
         * *****
         * *****
         * 4 lines = 4 Rows = no of outer loop will run which is 4
         */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.println("* ");
            }
            System.out.println();
        }
    }
}
