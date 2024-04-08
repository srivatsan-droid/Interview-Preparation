package Loops.Functions.CodeChef_Problems.Arrays.Patterns;

import java.util.Scanner;

public class gradingStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[];
        int n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int multiple = 5;
        int rounded_grades[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            int r = arr[i] % multiple;
            int next_multiple = arr[i] + (multiple - r);
            if (next_multiple - arr[i] < 3 && arr[i] >= 38) {
                rounded_grades[i] = next_multiple;
            } else {
                rounded_grades[i] = arr[i];
            }
        }
        // Printing the rounded grades
        for (int i = 0; i < n; i++) {
            System.out.println(rounded_grades[i]);
            sc.close();
        }
    }
}
