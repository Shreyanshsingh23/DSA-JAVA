import java.util.Arrays;

public class insertion_sorting_algorithm{
   public static void main(String [] args){

       int [] arr = {12,1,2,3,4,67,9,75,4,43,12,3,2};
       insertionSort(arr);
     
     System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr) {

        // first loop will run till n-2
       for(int i = 0; i < arr.length -1; i++){
        
        for(int j = i+1; j > 0 ; j--){
           if(arr[j] < arr[j-1]){
            // swap two numbers
            swap(arr,j,j-1); 
           }
           else{  // if element at j position will be >= element at j-1, this means the array behind it will be already sorted
            break;
           }
        }
       }
    }

    static void swap(int[] arr, int start, int second){
        int temp = arr[start];
         arr[start] = arr[second];
         arr[second] = temp;
    }
    
}
