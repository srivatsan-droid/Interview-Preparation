import java.util.Scanner;

public class closestNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (arr[i] + arr[j] < min) {
                    min = arr[i] + arr[j];
                }
            }
        }
        int result[] = { min };
        for (int no : result) {
            System.out.println(no + " ");

        }
        sc.close();
    }
}
