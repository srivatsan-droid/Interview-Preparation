import java.util.Scanner;

public class taumBday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++) {
            long b = sc.nextLong(); // Using long to handle large inputs
            long w = sc.nextLong();
            long bc = sc.nextLong();
            long wc = sc.nextLong();
            long z = sc.nextLong();
            
            // Calculating the minimum cost by considering different scenarios
            long blackGiftCost = Math.min(bc, wc + z); // Cost of buying black gifts
            long whiteGiftCost = Math.min(wc, bc + z); // Cost of buying white gifts
            
            // Total cost
            long totalCost = b * blackGiftCost + w * whiteGiftCost;
            
            System.out.println(totalCost);
        }
        sc.close();
    }
}
