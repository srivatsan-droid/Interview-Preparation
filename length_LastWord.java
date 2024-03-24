public class length_LastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        int lastIndexLength = lastWord(s);
        System.out.println("Length of Last Word : " + lastIndexLength);
    }

    public static int lastWord(String s) {
        s = s.trim();
        // Find the Space of Last index character
        int lastIndex = s.length() - 1;
        // If no Space is Found return the length of the entire string
        int i;
        for (i = lastIndex; i >= 0; i--) {
            if (s.charAt(i) == ' ')
                break;
        }
        return (lastIndex - i);
    }
}
