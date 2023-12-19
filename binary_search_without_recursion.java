public class binary_search_without_recursion {
    public static void main(String [] args){
        int [] arr = {2,4,8,12,45,56,78,89,90,};
        int target = 78;
        int answer = binarySearch(arr,target);
        System.out.println("Index of target element is " + answer);
    }
    
    static int binarySearch(int [] array , int target){

        int start = 0;
        int end = array.length - 1;

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
