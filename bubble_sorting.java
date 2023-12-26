import java.util.Arrays;

public class bubble_sorting {
    public static void main(String[] args) {
       
        int [] arr = {5,4,3,2,1};
         bubbleSort (arr);
         System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort (int[] arr){
        
        int count = 0;
        for (int i = 0; i < arr.length -1; i++) {
            
            boolean swapped = false;

            for (int j = 1; j <= arr.length -1 -i; j++) {
                
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }

            }
            count ++;

            if(!swapped){
                break;
            }

        }

        System.out.println(count);
        
    }

}
