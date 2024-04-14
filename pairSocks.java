import java.util.Arrays;

public class pairSocks {
    static int sockMerchant(int n, int[] ar) {
        // Sort the array so that all socks of the same color are grouped together
        Arrays.sort(ar);
        
        int pairs = 0;
        int i = 0;
        while (i < n - 1) {
            // If two adjacent socks have the same color, they form a pair
            if (ar[i] == ar[i + 1]) {
                pairs++;
                // Skip the paired socks
                i += 2;
            } else {
                // Move to the next sock
                i++;
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        // Sample Input
        int n = 9;
        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        // Output: 3
        System.out.println(sockMerchant(n, ar));
    }
}
