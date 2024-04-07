package Loops.Functions.CodeChef_Problems.Arrays.Patterns;

import java.util.Scanner;

public class bigSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        n = arr.length;
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long sum = 0;
        for(int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
        sc.close();
    }
}
