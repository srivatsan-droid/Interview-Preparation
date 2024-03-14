public class sign_Product {
    public static void main(String[] args) {
        int[] nums = { -1, 1, -1, 1, -1 };
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            // If array has 0 element then 0 will be printed
            if (nums[i] == 0) {
                System.out.println(0);
            }
            // Counting negative integer elements in array
            else if (nums[i] < 0) {
                count++;
            }
        }
        if (count % 2 != 0) {
            System.out.println(-1);
        } else {
            System.out.println(1);
        }
    }
}
