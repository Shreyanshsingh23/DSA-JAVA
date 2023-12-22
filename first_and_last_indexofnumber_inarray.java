import java.util.*;

public class first_and_last_indexofnumber_inarray {
    public static void main(String[] args){
        int[] arr = {1,2,4,7,7,7,7,8,8,8,9};
        int target = 7;

        int []  ans = new int[2];
        ans = findIndex(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] findIndex(int [] array, int target){
        // we can run two binary searches 
        // first one to find the first index of the number   -- this will be similar to find floor of a number

        // and second one to find the last index of the number   -- this will be similar to find ceiling of a number

        // if the number is not present inm array return [-1,-1]

        int [] ans = new int [2];
        ans[0] = firstIndex(array, target);
        ans[1] = lastIndex(array, target);

        return ans;
    }

    static int firstIndex(int []  array, int target){
         int start = 0;
        int end = array.length - 1;

        int mid = 0;
        while(start <= end){

            mid = start + (end-start)/2;

            if(array[mid] < target){
                start = mid + 1;

            }
            else{   // agr middle element target element ke barabar bhi ho jayega toh end peeche aa jayega mtlb chota wala index aayega iss function ke through                
                // aur hum yahi chahte bhi hain kyuki first index dhundh rahe hain 
                end = mid - 1;
            }

        }

        return start;
    }

     static int lastIndex(int []  array, int target){
         int start = 0;
        int end = array.length - 1;

        int mid = 0;
        while(start <= end){

            mid = start + (end-start)/2;

            if(array[mid] > target){
                end = mid - 1;

            }            // agr middle element target element ke barabar bhi ho gaya toh start aage aa jayega mtlb bada wala index aayega aur hum yahi chahte hain kyuki last index dhundh rahe hain
            else{
                
                start = mid + 1;
            }

        }

        return end;
    }
}
