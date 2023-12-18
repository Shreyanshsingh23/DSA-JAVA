import java.util.Arrays;
public class search_in_2Darrrays_return_int {
    public static void main(String[] args) {
  
    
            // creating a 2D Array
            int [][] arr = {
                {23,45,78,90},
                {18,7,65},
                {70,43,75},
                {12,13,14}
            };
        
            int num = 23;
             int [] ans = search(arr,num);
            System.out.println(Arrays.toString(ans));
        
        }
        
        static int[] search(int[] [] array, int target){
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length ; j++) {
                    if(array[i][j] == target){
                        return new int[] {i,j} ;
                    }
                }
            }
              return new int[0];
        }    
    }
    

