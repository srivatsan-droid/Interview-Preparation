import java.util.Scanner;

public class breakingRecords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        int max_count = 0;
        int min_count = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                max_count += 1;
            }
            if (arr[i] < min) {
                min = arr[i];
                min_count += 1;
            }
        }
        System.out.println(max_count);
        System.out.println(min_count);
        sc.close();
    }
}