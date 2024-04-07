package Loops.Functions.CodeChef_Problems.Arrays.Patterns;

import java.util.Scanner;

public class birthdayCandles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                count = 1; // Reset count since we found a new tallest candle
            } else if (arr[i] == max) {
                count++; // Increment count for each candle of the tallest height
            }
        }
        System.out.println(count);
        sc.close();
    }
}
