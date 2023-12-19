import java.util.Arrays;

public class ascending_sorting_array{
    public static void main(String[] args) {
       
        int [] arr = {5,56,78,23,45,65,32,98,45,8,32,56,54};

        arr = sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int [] sortArray(int []  array){
 
        int temp = 0;
        for (int i = 0; i < array.length - 1 ; i++) { // will evaluate upto 2nd last element
            if(array[i+1] < array[i]){

                temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;

            }
        }
        return array;
    }

}
