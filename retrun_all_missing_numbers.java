import java.util.ArrayList;
import java.util.Arrays;

public class retrun_all_missing_numbers {
    public static void main(String[] args) {
        int[] arr = {2,5,6,4,8};
       
        // finding the length of the given array

        int n = maxNum(arr);
       
        ArrayList<Integer> list = missingNumbers(arr, n);
     
     

        
        
    }

    static int maxNum(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];

            }
        };

        return max;
    }

    static ArrayList<Integer> missingNumbers(int [] arr, int n)
    {
         ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;

            if(arr[i] < arr.length && arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }
            else{
                i++;
            }
        }

        // now the array is sorted 
        // we need to find missing numbers

        for (int j = 0; j < arr.length; j++) {
            if(arr[j]-1 != j ){
                list.add(j+1);
            }
        }


        return list;
    }

    static void swap (int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
