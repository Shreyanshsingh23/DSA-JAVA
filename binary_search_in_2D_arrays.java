import java.util.Arrays;

public class binary_search_in_2D_arrays {
    public static void main(String[] args) {
        int [][] arr = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {28, 29, 37, 49},
            {33, 34, 38, 50}
        };
        int target = 50;

System.out.println(Arrays.toString((binarySearch(arr,target))));
    }

    static int[] binarySearch(int[][] arr, int target){
        int row = 0;
        int col = arr[0].length - 1;  // row = 0 and col = last, this means pointer is on the top right most element
        
        while(row < arr.length && col >= 0){
            if(arr[row][col] == target){
                return new int [] {row,col};
            }
        else if(arr[row][col] > target)// this  means all the elements of the last column are greater than the target element, so col--
        {
            col--;
        }
        else{
            row ++;
        }
        }
        // control reached here, this means target element was not found
        return new int[] {-1,-1};
    }
}
