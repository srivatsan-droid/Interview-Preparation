import java.util.*;
public class arraySubset{

    /**
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        int arr[] = {1,2,3,4,5,6};
        int arr2[] = {2,3,4};
        int arr1_length = arr.length;
        int arr2_length = arr2.length;
        Set<Integer> set1 = new HashSet<>();
        for(int i =0;i<arr1_length;i++){
            set1.add(arr[i]);
        }
        for(int i =0;i<arr2_length;i++){
            if(!set1.contains(arr2[i])){
                System.out.println("No Arr2 is not a subset of array 1");
            }
        }
        System.out.println("Yes Arr2 is a subset of Arr1");
    }
}