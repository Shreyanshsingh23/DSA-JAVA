public class quicksort {
    public static void main(String[] args) {
        int[] arr = {1,3,2,4,5};
        sort(arr,0,arr.length-1);
        System.out.println(arr);
    }

    static void sort(int[] arr, int s, int e){
       // base condition
        if(e-s == 0){
        return;
       }

       int pivot = s + (e-s)/2;

        while(s<=e){
            
            // selecting s element which is greater than pivot so can swap it
            while(arr[s] < arr[pivot]){
                s++;
            }

             // selecting e element which is greater than pivot so can swap it
             while(arr[e] > arr[pivot]){
                e--;
            }

            swap(arr,s,e);
            s++;
            e--;


        }

        sort(arr,0,e);
        sort(arr,s,arr.length-1);
    }

    static void swap(int[] arr, int f , int s){
        int temp = arr[f];
        arr[f]= arr[s];
        arr[s]= temp;
    }

}
