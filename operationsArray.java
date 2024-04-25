import java.util.ArrayList;
import java.util.Scanner;

public class operationsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result[] = new int[arr.length];
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                arr[i] *= 2;
                arr[i + 1] = 0;
            }
        }
        // Add the Last Element to the list
        int i = 0;
        for (int num : arr) {
            if (num > 0)
                result[i++] = num;
            System.out.println(result);
        }
        sc.close();
    }
}
