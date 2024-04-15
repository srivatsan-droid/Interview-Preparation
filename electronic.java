import java.util.Scanner;

public class electronic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int keyboard[] = new int[n];
        int drives[] = new int[m];
        for (int i = 0; i < n; i++) {
            keyboard[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            drives[i] = sc.nextInt();
        }
        int max_sum = -1; // Initialize max_sum to -1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int sum = keyboard[i] + drives[j];
                if (sum <= b && sum > max_sum) {//This is for FAlse case which is printing -1 if there is no keyboard and usb drive found within the budget 
                    max_sum = sum; // Update max_sum only if the sum is valid and greater than current max_sum
                }
            }
        }
        System.out.println(max_sum != -1 ? max_sum : -1); // Print -1 if no valid combination found
        sc.close();
    }
}
