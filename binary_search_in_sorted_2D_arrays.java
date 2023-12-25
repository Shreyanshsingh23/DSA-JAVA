import java.util.Arrays;

public class binary_search_in_sorted_2D_arrays {
    public static void main(String[] args) {
        int [][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        
        
        System.out.println(Arrays.toString(binary_search2D(arr,4)));
    }

    // function to eliminate rows/columns

    static int[] binary_search2D(int[][] arr, int target){
       int rows = arr.length ;
       int cols = arr[0].length ;
       

       if(rows == 1){
        return binary_search(arr, 0, 0, cols-1, target) ;  // i.e. simple Binary Search
       }
       // you can take mid of either rows or columns
       // here I am taking columns

      

        int cMid = cols/2;

         int rStart = 0;
        int rEnd = rows-1;
        int rMid = 0;
       
        // this loop should run until 2 rows are left
       // condition for this is rEnd = rStart + 1

       while((rEnd-rStart) > 1){

         rMid = rStart + (rEnd - rStart)/2;

        
         if(arr[rMid][cMid] == target){

            return new  int[] {rMid,cMid};
        }

        else if(arr[rMid][cMid] > target ){
            rEnd = rMid;
        }

        else{
            rStart = rMid;
        }


       }

       // now only two rows are left 
       // check that whether target element is present in middle column or not

       if(arr[rStart][cMid] == target){
        return new int [] {rMid,cMid};
       }
        if(arr[rStart + 1][cMid] == target){
        return new int [] {rMid + 1,cMid};
       }

       // elelment is not present in middle column
       // now consider 4 parts

       // part 1
       // we will search in this part only when the element just before midd column is <= target

       if(arr[rStart][cMid-1] >= target){
        return binary_search(arr, rStart, 0 , cMid -1, target);
       }
       
       // part 2
       // we will search in this part only when the element just before midd column is <= target

       if(arr[rStart + 1][cMid-1] >= target){
        return binary_search(arr, rStart + 1, 0, cMid -1, target);
       }
       
       // part 3
       // we will search in this part only when the element just after midd column is >= target
       // there will be one more condition checked that whether the target lies between the mid+1 and last element, because if target is greater than the last element (this means target lies in the below row) and then also we checked this row than -1,-1 will be returned
       if(arr[rStart][cMid+1] <= target && target <= arr[rStart][cols-1]){
        return binary_search(arr, rStart, cMid + 1, cols - 1, target);
       }
       
       
       // part 4
       

       else{ 
        return binary_search(arr, rStart + 1, cMid + 1, cols - 1 , target);
       }
       

       }
       

    static int[] binary_search(int[] [] arr, int row,int cStart, int cEnd, int target){
       
        
        int mid = cStart + (cEnd - cStart)/2;

        if(arr[row][mid] == target){
            return new int[] {row,mid};
        }

        else if(arr[row][mid] > target){
            cEnd = mid -1;

        }
        else{
            cStart = mid + 1;
        }

        return new int[] {-1,-1};
    }

}
