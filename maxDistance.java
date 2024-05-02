import java.util.HashMap;

public class maxDistance {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,1};
        int ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                ans = Math.max(ans,i-map.get(arr[i]));
            }
            else{
                //To handle edge test case
                map.put(arr[i],i);
            }
        }
        System.out.println(map);
    }
}
