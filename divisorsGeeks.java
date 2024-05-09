public class divisorsGeeks{
    public static void main(String[] args){
        int n = 2;
        boolean ans = divisors(n);
        System.out.println(ans);
    }
    static boolean divisors(int n){
        int x =  n % 2;
        return x == 0;
    } 
}