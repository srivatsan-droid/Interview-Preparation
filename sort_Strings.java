import java.util.Arrays;

public class sort_Strings {
    public static void main(String[] args) {
        String s = "zzabcdefghhjjikk";
        char c[] = s.toCharArray();
        Arrays.sort(c);
        //Method used for Sorting an set of characters so converted this String into an char Array
        System.out.println("The Sorted String is :" + s.valueOf(c));
    }
}
