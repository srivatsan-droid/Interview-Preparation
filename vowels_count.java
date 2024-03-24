public class vowels_count {
    public static void main(String[] args) {
        /*
         * We Need to count the numbers within the given range
         * Left = 0,right = 2
         * From the Given Words "are" ,"amy" "u" -- > left = 0 to start from left and
         * end with the right we need to find the count of vowels.
         */
        String words[] = { "are", "amy", "u" };
        int left = 0;
        int right = 2;
        int count = 0;
        for (int i = left; i <= right; i++) {
            if (isVowel(words[i])) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isVowel(String word) {
        char firs_char = word.charAt(0);
        char last_char = word.charAt(word.length() - 1);
        return isVowel(firs_char) && isVowel(last_char);
    }
    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
