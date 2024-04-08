package Loops.Functions.CodeChef_Problems.Arrays.Patterns;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] arr = new long[5]; // Using long instead of int to prevent overflow
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextLong();
        }

        long minSum = Long.MAX_VALUE; // Initialize minSum to maximum possible value
        long maxSum = Long.MIN_VALUE; // Initialize maxSum to minimum possible value
        long totalSum = 0; // Initialize totalSum to 0

        // Calculate total sum and find min and max sum
        for (int i = 0; i < 5; i++) {
            totalSum += arr[i];
            minSum = Math.min(minSum, arr[i]);
            maxSum = Math.max(maxSum, arr[i]);
        }

        // Minimum sum is total sum minus maximum number
        long minResult = totalSum - maxSum;
        // Maximum sum is total sum minus minimum number
        long maxResult = totalSum - minSum;

        System.out.println(minResult + " " + maxResult);

        sc.close();
    }
}
