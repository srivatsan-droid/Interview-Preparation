package Recursion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        printNumbers(1, N);
    }

    public static void printNumbers(int current, int N) {
        if (current > N) {
            return;
        }
        System.out.println(current);
        printNumbers(current + 1, N);
    }
}
