import java.util.Scanner;

public class valley {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String path[] = new String[n];
        for (int i = 0; i < n; i++) {
            path[i] = sc.nextLine();
        }
        int count = 0;
        int last = path.length - 1;
        // int downCount = 0;
        for (int i = 0; i < n; i++) {
            if (path[i] == path[last]) {
                count += 1;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
