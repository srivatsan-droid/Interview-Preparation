package Loops.Functions.CodeChef_Problems.Arrays.Patterns;

import java.util.Scanner;

public class findDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = sc.nextInt();
        int temp = n;
        int count = 0;
        while (t-- > 0) {
            while (temp != 0) {
                int digit = temp % 10;
                if (digit != 0 && n % digit == 0) {
                    count++;
                }
                temp /= 10;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
