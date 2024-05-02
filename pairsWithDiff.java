
public class pairsWithDiff {
    public static void main(String[] args) {
        int arr[] = {1,2,2,1};
        int k =1;
        int count = 0;
        for (int idx = 0; idx < arr.length; idx++) {
            for(int j = idx+1;j<arr.length; j++) {
                if(idx < j){
                    if(Math.abs(arr[idx] - arr[j]) == k){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
