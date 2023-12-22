public class ceiling_of_anumber {
    
    public static void main(String[] args){
        int[]  arr = {9,13,15,17,18,20,22,23,25,27};
        int target = 28; // return ceiling of target 
        
        
        int index = ceiling(arr,target);
        System.out.println("Index of ceiling = " + index);
    }


    static int ceiling(int [] array, int target){ 
        // ceiling is the smallest number which is greater than or equal to the target element 

        // but what is the largest element of the array is smaller than the target element 
        // this means there is no number which is equal to or greater than than the target element
        // for example - 28
        
        // in this case we wamt -1 as the answer

        if(array[array.length -1] < target){
            return -1;
        }
        int start = 0;
        int end = array.length - 1;
        int mid = 0;
        while(start <= end){
            mid = start + (end - start)/2;
            if(array[mid] < target){
                start = mid + 1;
                
            }
            else if (array[mid] > target){
                end = mid - 1;
            }
            else if (array[mid] == target){
                return mid;
            }
        
       
        }
          return start;
    }
}