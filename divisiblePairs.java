package Loops.Functions.CodeChef_Problems.Arrays.Patterns;

import java.util.Scanner;

public class divisiblePairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[];
        arr = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Condition to Find If the Elements in the array is equal to or divisible by 3
                if ((arr[i] + arr[j]) % k == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}
