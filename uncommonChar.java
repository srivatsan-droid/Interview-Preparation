import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class uncommonChar {
    public static void main(String[] args) {
        String A = "geeksforgeeks";
        String B = "geeksquiz";
        Set<Character> Aset = new HashSet();
        Set<Character> Bset = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (char c : A.toCharArray()) {
            Aset.add(c);
        }
        for (char c : B.toCharArray()) {
            Bset.add(c);
        }
        Set<Character> uncommon = new HashSet();
        for (char c : Aset) {
            if (!Bset.contains(c)) {
                uncommon.add(c);
            }
        }
        for (char c : Bset) {
            if (!Aset.contains(c)) {
                uncommon.add(c);
            }
        }

        for (char ch : uncommon) {
            sb.append(ch);

        }

        if (sb.length() == 0) {
            System.out.println("-1");
        }
        // To Print the Output of uncommon characters in sorted order we need to use
        // char array
        char ch[] = sb.toString().toCharArray();
        Arrays.sort(ch);
        System.out.println(String.valueOf(ch));
    }

}
