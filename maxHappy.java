import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Srivatsan
 */
public class maxHappy{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Length of the array
        int n = sc.nextInt();
        //Taking array input
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        long ans = maximumHappiness(arr, k, n);
        System.out.println(ans);
    }

    public static long maximumHappiness(int arr[],int k,int n){
        Arrays.sort(arr);
        long ans = 0;
        int decremented = 0;
        for(int i = n-1;i<=n-k;i--){
            ans += Math.max(0, arr[i] - decremented);
            ++decremented;

        }
        return ans;
    }
}