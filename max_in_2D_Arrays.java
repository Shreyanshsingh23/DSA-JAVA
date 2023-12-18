import java.util.Arrays;

public class max_in_2D_Arrays{
   public static void main(String[] args) {
      // creating a 2D Array
            int [][] arr = {
                {23,45,7,9},
                {18,7,65},
                {70,43,75},
                {12,13,14}
            };
        
            
             int [] ans = search_max(arr);
            System.out.println(Arrays.toString(ans));
             System.out.println(arr[ans[0]][ans[1]]);
       
        }
        
        static int[] search_max(int[] [] array){
            int x = Integer.MIN_VALUE;
            int i,j = 0;
            int a=0,b=0;
            for (i = 0; i < array.length; i++) {
                for ( j = 0; j < array[i].length ; j++) {
                    if(array[i][j] > x){
                        x = array[i][j] ;
                        a=i;
                        b=j;
                        // initialised these two variables because loop will be keep executing continously after highest value also because condition in loop is satisfied till last element of 2D array
                        
                        // so i,j returns the index of last element of 2d ARRAY 

                        // and the benefit of initializing and storing the values in a and b is that the value does not changes if more greater element is not found 
                    }
                }
            }
              return new int[] {a,b};
   }
}