import java.util.Arrays;

public class quicksort {
    public static void main(String[] args) {
        int[] arr = {1,3,2,4,5};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int low, int high){
       // base condition
        if(low<=high){
        return;
       }
       int s = low;
       int e = high;
       int pivot = s + (e-s)/2;

        while(s<=e){
            
            // selecting 's' element which is greater than pivot so can swap it
            while(arr[s] < arr[pivot]){
                s++;
            }

             // selecting 'e' element which is greater than pivot so can swap it
             while(arr[e] > arr[pivot]){
                e--;
            }

            // this check is the reason why it will not swap if its already sorted, unlike merge sort
            if(s<=e){
            swap(arr,s,e);
            s++;
            e--;}


        }

        //now my array is sorted, I need to sort two halves now

        sort(arr,low,e);
        sort(arr,s,high);
    }

    static void swap(int[] arr, int f , int s){
        int temp = arr[f];
        arr[f]= arr[s];
        arr[s]= temp;
    }

}
