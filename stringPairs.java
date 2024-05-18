public class stringPairs {
    public static void main(String[] args){
        String [] nums = {"777","7","77","77"};
        String target = "7777";
        int count = 0;
        for(int i =0;i<nums.length;i++){
            for(int j = 0;j<nums.length;j++){
                if(i != j){
                    if((nums[i] + nums[j]).equals(target)){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
