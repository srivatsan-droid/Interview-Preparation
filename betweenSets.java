import java.util.Scanner;

public class betweenSets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int j = 0; j < m; j++) {
            b[j] = sc.nextInt();
        }
        int count = 0;
        for (int i = 1; i <= 100; i++) { // Assuming the range of elements is 1 to 100
            if (isBetweenSets(a, b, i)) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }

    // Method to check if a number is between the sets
    static boolean isBetweenSets(int[] a, int[] b, int num) {
        for (int i = 0; i < a.length; i++) {
            if (num % a[i] != 0) {
                return false;
            }
        }
        for (int j = 0; j < b.length; j++) {
            if (b[j] % num != 0) {
                return false;
            }
        }
        return true;
    }
}
