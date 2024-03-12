public class reverse_string{
    public static void main(String[] args){
        String s = "Geeks For Geeks";
        int n = s.length();
        char [] ch = s.toCharArray();
        char temp;
        for(int i =0,j=n-1;i<j;i++,j--){
            temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
        }
        System.out.println(ch);
    }
}