import java.util.Arrays;
import java.util.Scanner;

public class toys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Sort the arrays
        Arrays.sort(arr);
        int total = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (total + arr[i] <= k) {
                total += arr[i];
                count++;
            } else {
                break;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
