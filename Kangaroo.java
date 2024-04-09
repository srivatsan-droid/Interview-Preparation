package Loops.Functions.CodeChef_Problems.Arrays.Patterns;

import java.util.Scanner;

public class Kangaroo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int v1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int v2 = scanner.nextInt();

        if (willMeet(x1, v1, x2, v2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }

    public static boolean willMeet(int x1, int v1, int x2, int v2) {
        if (v1 == v2) {
            return x1 == x2; // If they have the same speed, they will meet only if they start at the same
                             // position.
        } else {
            // Check if there exists an integer n such that x1 + n * v1 = x2 + n * v2
            return (x2 - x1) % (v1 - v2) == 0 && (x2 - x1) / (v1 - v2) >= 0;
        }
    }
}
