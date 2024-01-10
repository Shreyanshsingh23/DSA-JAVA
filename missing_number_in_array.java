import java.util.Arrays;

public class missing_number_in_array {
    public static void main(String[] args){
       int[] array= {1,2,6,3,4};
       
       sort(array);
        for(int i = 0; i < array.length -1 ; i++){
            if(array[i] != i+1){
               // return i+1;
            }
        }
       // return array.length + 1;
       System.out.println(Arrays.toString(array));
      }
        
    static void sort(int [] arr){
    
        for(int i = 0; i < arr.length - 1;i++){
            for(int j = i+1; j > 0 ; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
            }
        }
         }
         }
       
       static void swap(int[] arr, int first, int second){
           int temp = arr[first];
           arr[first] = arr[second];
           arr[second] = temp;
    }
}
