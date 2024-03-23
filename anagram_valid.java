import java.util.Arrays;

public class anagram_valid {
    public static void main(String[] args) {
        String s = "anagram";
        String s1 = "nagaram";
        char a[] = s.toCharArray();
        char b[] = s1.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println("Two Strings are Valid Anagram: " + Arrays.equals(a, b));
    }
}
