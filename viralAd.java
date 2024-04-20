import java.util.Scanner;

public class viralAd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int people = 5;
        int liked = 0;
        
        for (int i = 0; i < n; i++) {
            int shared = people / 2;
            liked += shared;
            people = shared * 3;
        }
        
        System.out.println(liked);
        sc.close();
    }
}
