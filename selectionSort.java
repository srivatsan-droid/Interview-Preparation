public class selectionSort{
/*
 * @author : Srivatsan
 */
    //Method to Implement the selection sort
    public static void sort(int arr[]){
        // Outer Loop for Selection the position of the Smallest Element
        for(int i = 0;i<arr.length;i++){
            //Consider the i as min index
            int minIndex = i;
            //Inner loop for Selecting the minimum Element
            for(int j = i;j<arr.length;j++){ 
                if(arr[j] < arr[minIndex]){ 
                    //If the condition satisfies then set min to current element
                    minIndex = j;
                }
            }
            //Swap i,min
            /*
             * Logic : 
             * Consider 10 as min while checking remaining arr we see 3 is min so swap it with min
             */
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[minIndex] = temp;
        }
    }
    // Method to print the array
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {10,5,26,3,15,22};
        System.out.println("Array before sorting:");
        printArray(arr);
        
        // Call the sort method
        sort(arr);
        
        // Print the sorted array
        System.out.println("Array after sorting:");
        printArray(arr);
    }
}