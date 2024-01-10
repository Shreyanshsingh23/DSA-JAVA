import java.util.Arrays;

public class cyclic_sorting_algorithm {
    public static void main(String[] args) {
        int [] arr = {3,5,2,1,4,6,7,8};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
     }

     static void cyclicSort(int[] arr){

        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;

          if(arr[i] == arr[correctIndex] ){
            i++;
          }

          else{
            swap(arr, i, correctIndex);
          }
        }
        }
    

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}