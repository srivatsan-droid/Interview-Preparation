import java.util.Scanner;

public class hackerRank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt(); // Number of queries
        for (int t = 0; t < q; t++) {
            String s = sc.next();
            String h = "hackerrank";
            int index = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == h.charAt(index)) {
                    index++;
                }
                if (index == h.length()) {
                    System.out.println("YES");
                    break;
                }
            }
            if (index != h.length()) {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
