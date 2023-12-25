//https://leetcode.com/problems/search-in-rotated-sorted-array/description/

public class search_target_in_rotated_array {
    public static void main(String[] args){
        int [] arr = {4,5,6,7,8,1,2,3};
        int target = 3; // ans = 6

        int pivot = pivot(arr);

        if(pivot == -1){
            
        System.out.println(binarySearch(arr, target, 0, arr.length-1));
        }
        else if(arr[pivot] == target){
            
        System.out.println(pivot);
        }
        else if(arr[0] < target){
            
        System.out.println(binarySearch(arr, target, 0, pivot -1));
        }
         System.out.println(binarySearch(arr, target, pivot +1, arr.length - 1));
    }

    
    static int pivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while(start <= end){
            mid = start + (end - start )/2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            else if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            else if (arr[start] <= arr[mid]){
                start = mid + 1;  // start = mid isliye nhi kiye kyuki maanlo agr iss array ka pivot i.e. arr[4] = 8 , mid element hota toh vo pehle case me hi pakad me aa jata fir isliye yeh wala case pivot element ko mid maante huye banaya hi nhi gaya hai
             }
             else{
                 end = mid  - 1;
             }
        }
        return -1; // returning -1 means array was sorted
    }

    static int binarySearch(int [] array , int target,int start, int end){

      
        while(start <= end){
            int mid = start/2 + end / 2;

            if(array[mid] < target){
                start = mid + 1;
            }
            else if (array[mid]  > target){
                end = mid -1;
            }
            else{
                return mid;
            }
        }

        // control reached till here 
        // this means the target element is not present in the array

        return -1;
    }
}
