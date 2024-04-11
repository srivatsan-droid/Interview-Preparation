package Loops.Functions.CodeChef_Problems.Arrays.Patterns;

import java.util.Scanner;

public class billSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[];
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int actual = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i != k) {
                sum += i;
            }
        }
        int share = sum / 2;
        if (actual > share) {
            System.out.println(actual - share);
        } else {
            System.out.println("Bon Appetit");
        }
        sc.close();
    }
}
