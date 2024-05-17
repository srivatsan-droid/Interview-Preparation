public class equilibrium {
    public static void main(String[] args) throws Exception {
        int arr[] = {1,3,5,2,2};
        int n = arr.length;
        int totalSum = 0;
        for(int i =0;i<n;i++){
            totalSum += arr[i];
        }
        int leftSum = 0;
        for(int i = 0;i<arr.length;i++){
            totalSum -= arr[i];
            if(leftSum == totalSum){
                System.out.println(i+1);//Index to be printed
            }
            leftSum += arr[i];//To handle the edge test case
        }
    }
}
