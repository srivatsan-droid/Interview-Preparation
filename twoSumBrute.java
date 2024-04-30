import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Srivatsan
 */
public class twoSumBrute {
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target = 9;
        List<Integer> sum = new ArrayList<>();
        for(int i =0;i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                if(arr[i] + arr[j] == target){
                    sum.add(arr[i]);
                    sum.add(arr[j]);
                }
            }
        }
        int[] result = new int[sum.size()];
        for(int i = 0; i < sum.size(); i++) {
            result[i] = sum.get(i);
        }
        System.out.println(result);
    }
}
