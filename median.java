import java.util.Arrays;
import java.util.Scanner;

public class median {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[];
        int n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        /*
         * To Find the median logic is :
         * /*
         * Total size of array / 2 we can get the median easily
         */
        Arrays.sort(arr);
        int mid = arr.length / 2;
        System.out.println("The median of the array is : " + mid);
        sc.close();

    }
}
