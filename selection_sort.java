import java.util.Arrays;

public class selection_sort {
public static void main (String[] args){
     int [] arr = {1,-2,-4,67,-665,0,-43};
     selectionSort(arr);
     
     System.out.println(Arrays.toString(arr));
}

static void selectionSort(int[] arr){
   

    for (int i = 0; i < arr.length; i++) {
        
          // find the maximum number in the array and swap with the correct index

          int last = arr.length - i - 1;
          int maxIndex = maxInd(arr,0,last);  // here ultimately we are runnning a loop n times but not written here directly
          // hence time complexity is not very good for thi sorting algorithm 
        
           
         
         int temp = arr[last];
         arr[last] = arr[maxIndex];
         arr[maxIndex] = temp;
         
    
    }
}

static int maxInd(int [] arr, int start,int end){
    int max = Integer.MIN_VALUE;
    int ans = 0;
    for (int i = 0; i <= end; i++) {
        if(arr[i] > max){
            max = arr[i];
            ans = i;
        }
    }

    return ans;
}
}
