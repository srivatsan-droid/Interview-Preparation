import java.util.Scanner;

public class hulk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        StringBuilder feeling = new StringBuilder("I hate");
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                feeling.append(" that I love");
            } else {
                feeling.append(" that I hate");
            }
        }
        feeling.append(" it");
        System.out.println(feeling);
    }
}
