import java.util.Scanner;

public class iceCreamParlour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int k = sc.nextInt();
            int size = sc.nextInt();
            int cost[] = new int[size];
            for (int j = 0; j < size; j++) { // Fixed loop condition
                cost[j] = sc.nextInt();
            }
            for (int l = 0; l < size; l++) {
                for (int m = l + 1; m < size; m++) { // Fixed loop start index
                    if (cost[l] + cost[m] == k) {
                        System.out.println((l + 1) + " " + (m + 1)); // Adding 1 to indices to match 1-based indexing
                        break; // Added break to exit inner loop once a pair is found
                    }
                }
            }
        }
        sc.close();
    }
}
