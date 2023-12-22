public class binary_search_in_infinite_array {
public static void main(String[] args){
    // infinte array means we can use array.length function 
    // although we are are not using infinite array here but we will not use arr.length
    // array is sorted 
 
    int [] arr = {1,4,5,6,7,8,9,12,13,14,16,17,19,20,22,23,25,27,29,30,41,42,44,45,47,49,50};
    int target = 19;
    int ans = findBoxOfLength(arr, target);
    
    System.out.println(ans);
}
  //Hence, we don't know the size of the array , we will think in opposite direction
  //i.e. in binary search we break the previous array in 2 parts so here we will start with smalller block and double the size 
 // we are creating this function to tell the search range in array
 static int findBoxOfLength(int [] array, int target){
   int start = 0;
   int end = start + 1;
   // we will keep doubling the size of search box till the target elemnent is greater than the array[end] 
   while(array[end] < target){
    start = end + 1;
    end = 2*(start) + 1;
   }
   int ans = findIndex (array, target, start, end);
   
   //this function will return the index of the target element by searching in the range that we are sending from this function

   return ans; 

 }

 static int findIndex(int [] array, int target , int start, int end){
    //applying simple Binary Search while(start <= end)
   while(start <= end){
     int mid = start + (end - start)/2;
   if(array[mid] == target){
    return mid;
   }
     else if(array[mid] < target){
        start = mid + 1;
    }

     else {
        end = mid - 1;
     }
    
    
   }

   return -1;
 }
}