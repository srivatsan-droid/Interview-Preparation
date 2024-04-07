package Loops.Functions.CodeChef_Problems.Arrays.Patterns;

import java.util.Scanner;

public class plusMinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        double count_positive = 0;
        double count_negative = 0;
        double count_zero = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                count_positive++;
            } else if (arr[i] < 0) {
                count_negative++;
            } else {
                count_zero++;
            }
        }

        double proportion_positive = count_positive / n;
        double proportion_negative = count_negative / n;
        double proportion_zero = count_zero / n;

        System.out.printf("%.6f\n", proportion_positive);
        System.out.printf("%.6f\n", proportion_negative);
        System.out.printf("%.6f\n", proportion_zero);

        sc.close();
    }
}
