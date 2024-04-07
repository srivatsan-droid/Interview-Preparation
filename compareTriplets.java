import java.util.Scanner;

public class compareTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3]; // Since you're working with triplets, the size should be fixed to 3
        int[] arr1 = new int[3]; // Similarly, for the second array

        // Input values for the first array
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }

        // Input values for the second array
        for (int i = 0; i < 3; i++) {
            arr1[i] = sc.nextInt();
        }

        // Compare corresponding elements and update scores
        int aliceScore = 0;
        int bobScore = 0;
        for (int i = 0; i < 3; i++) {
            if (arr[i] > arr1[i]) {
                aliceScore++; // Alice gets a point
            } else if (arr[i] < arr1[i]) {
                bobScore++; // Bob gets a point
            }
            // If the elements are equal, no one gets a point
        }

        // Create an array to store the scores
        int[] result = { aliceScore, bobScore };

        // Output the scores
        for (int score : result) {
            System.out.print(score + " ");
        }

        sc.close();
    }
}
