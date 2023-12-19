public class binary_search1 {
   public static void main(String[] args){

    int [] arr = {2,4,8,12,45,56,78,89,90};
    int target = 9;
    int start = 0;
    int end = arr.length - 1;
    int answer = binarySearch(arr, target,start,end);
     
    System.out.println("Index of target element is " + answer); 

   }
   // return index of the target element
// return -1 if target element is not present

static int binarySearch(int[] array, int target,int start,int end){
   



    int index=0;

     if(start > end){
        return -1;
    }
    int mid = (start + end)/2;

    //using recursion 

    if(array[mid] < target){
        start = mid + 1;
       index =  binarySearch(array, target,start,end);
    }
    else if(array[mid] > target){
 
        end = mid - 1;
        index = binarySearch(array, target, start, end);
    }
     
        else if(array[mid] == target){
            index = mid;
        }

        return index;
    
}
   

}


