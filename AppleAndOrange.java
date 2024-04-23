import java.util.*;


public class AppleAndOrange {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int t = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[] apples = new int[m];
        for (int i = 0; i < m; i++) {
            apples[i] = scanner.nextInt();
        }
        int[] oranges = new int[n];
        for (int i = 0; i < n; i++) {
            oranges[i] = scanner.nextInt();
        }
        countApplesAndOranges(s, t, a, b, apples, oranges);
        scanner.close();
    }


    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int appleCount = 0;
        int orangeCount = 0;


        for (int apple : apples) {
            if (a + apple >= s && a + apple <= t) {
                appleCount++;
            }
        }


        for (int orange : oranges) {
            if (b + orange >= s && b + orange <= t) {
                orangeCount++;
            }
        }


        System.out.println(appleCount);
        System.out.println(orangeCount);
    }
}
