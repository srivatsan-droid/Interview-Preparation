public class rotateArray {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7};
        int d = 2;
        int n = arr.length;
        rotate(arr, d, n);
        PrintTheArray(arr, n);
    }
    public static void rotate(int arr[],int d,int n ){
        d = d % n;
        //Creating a Temporary Array to store the rotating array elements
        int temp[] = new int[n];
        //To store the current index we use k 
        int k = 0;
        //Storing the first n - k Elements into the array
        for(int i = d;i<n;i++){ 
            temp[k] = arr[i];
            k++;
        }
        //Storing the First d Elements into arr[i] -> temp
        for(int i = 0;i<d;i++){ 
            temp[k] = arr[i];
            k++;
        }
        for(int i =0;i<n;i++){
            arr[i] = temp[k];
        }
    }
        //Method to Print the array
        static void PrintTheArray(int arr[], int n)
        {            
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i]+" ");
            }
        }
    }

