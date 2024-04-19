package Loops.Functions.CodeChef_Problems.Arrays.Patterns;

import java.util.Scanner;

public class Solution {

    static int solve(int[] s, int d, int m) {
        int ways = 0;
        int sum = 0;

        for (int i = 0; i < s.length; i++) {
            if (i < m) {
                sum += s[i];
            } else {
                if (sum == d) {
                    ways++;
                }
                sum += s[i] - s[i - m];
            }
        }

        if (sum == d) {
            ways++;
        }

        return ways;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = scanner.nextInt();
        }
        int d = scanner.nextInt();
        int m = scanner.nextInt();
        int result = solve(s, d, m);
        System.out.println(result);
        scanner.close();
    }
}
