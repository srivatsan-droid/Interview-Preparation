public class replaceZeros {
public static int replaceZerosWithFive(int num) {
    String s = Integer.toString(num);
    StringBuilder sb = new StringBuilder();
    for(char c : s.toCharArray()){
        if(c == '0'){
            sb.append('5');
        }
        else{
            sb.append(c);
        }
    }
    return Integer.parseInt(sb.toString());
}   
    public static void main(String[] args) {
        int num = 1005;
        int ans = replaceZerosWithFive(num);
        System.out.println("After conversion the integer is : "+ans);
    }
}
