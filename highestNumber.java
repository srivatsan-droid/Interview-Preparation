import java.util.*;
public class highestNumber {
    public static void main(String[] args){
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        int max = a.get(0);
        for (int idx = 0; idx < a.size(); idx++) {
            if(a.get(idx) > max){
                max = a.get(idx);
            }
            
        }
        System.out.println(max);
    }
}
