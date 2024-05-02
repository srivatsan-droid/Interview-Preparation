/*
 * @author : Srivatsan
 */

public class uniqueString{
    public static void main(String[] args){
        String s = "leetcode";
        int count []= new int[26]; 
        for(char c : s.toCharArray()){
            ++count[c - 'a'];
        }
        for (int idx = 0; idx < s.length(); idx++) {
            if(count[s.charAt(idx) - 'a'] == 1){
                System.out.println(idx);
            }
            
        }
        System.out.println(-1);
    }
}