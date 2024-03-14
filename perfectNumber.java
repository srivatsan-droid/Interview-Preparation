public class perfectNumber {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        if (n == 1) {
            System.out.println(0);
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            sum += i;
            if (n % i == 0) {
                sum += i;
                sum += (n / i);
            }
        }
        if (sum == n) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
