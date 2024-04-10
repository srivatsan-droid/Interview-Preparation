package Loops.Functions.CodeChef_Problems.Arrays.Patterns;

import java.util.Scanner;

public class angryProfessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[];
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= 0) {
                count++;
            }
        }
        if (count >= k) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        sc.close();
    }
}
