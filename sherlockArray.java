import java.util.Scanner;

public class sherlockArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int total_sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total_sum += arr[i];
        }
        int left_sum = 0;
        for (int i = 0; i < n; i++) {
            if (left_sum == total_sum - left_sum - arr[i]) {
                System.out.println("YES");
                break;
            }
            left_sum += arr[i]; // Update left sum
        }
        if (left_sum != total_sum - left_sum) {
            System.out.println("NO");
        }
        sc.close();
    }

}
