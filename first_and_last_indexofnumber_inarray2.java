import java.util.Arrays;

public class first_and_last_indexofnumber_inarray2 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,7,7,7,7,8,8};
        int target = 9;
        int [] ans = new int [2] ;
        ans[0] = findIndex(arr,target,true);
        ans[1] = findIndex(arr,target,false);
        System.out.println(Arrays.toString(ans));
    }

    static int findIndex(int [] array, int target, boolean first_index){
        int start = 0;
        int end = array.length - 1;
        int mid = 0;
        int ans = -1;   // if element is not present in array return -1
        
        while(start <= end){
            mid = start + (end - start)/2;

            if(array[mid] < target){
                start = mid + 1;
            }
            else if (array[mid] > target){
                end = mid - 1;
            }
            else {    
                // this means that array[mid] == target element
                // ans will remain -1 if arr[mid] == target even once  i.e. target element is not found in array

                ans = mid;
               if(first_index){
                    end = mid - 1;
               }
               else {
                start = mid + 1;
               }
            }
        }
        return ans;
    }
}
