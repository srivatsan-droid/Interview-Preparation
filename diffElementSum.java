public class diffElementSum {
    public static void main(String[] args) {
        int arr[] = {1, 15, 6, 3};
        int n = arr.length;
        int elementSum = 0;
        int digitSum = 0;

        for (int i = 0; i < n; i++) {
            elementSum += arr[i];
            digitSum += calculateDigitSum(arr[i]);
        }

        int difference = elementSum - digitSum;
        System.out.println(difference);
    }

    public static int calculateDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
