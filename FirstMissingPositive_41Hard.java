// https://leetcode.com/problems/first-missing-positive/

public class FirstMissingPositive_41Hard {
    public static void main(String[] args) {
        int i = 0;
          
        while(i < arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[correctIndex]){    // we will ignore negatives and sort all the positive elements and used cyclic sort because all positive numbers will be continous i.e. in order of 1 to N
            
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
            else{
                i++; 
            }
   }   

    // now the array will be sorted i.e. all positve elements are sorted
    // example: [1,2,3,-2,5,6] 
    // now we will start checking from 0th index and arr[0] should be equal to 1 and next should be 2 and so on
    // the index on which the element is not equal to index+1 , will return the answer index+1

       for(int j = 0; j < arr.length; j++){
           if(arr[j] != j+1){
               return j+1;
           }
       }

       return arr.length + 1;
    }
}






// this is my solution, passed all test cases 
//  but the one which is in leetcode right now is more efficient, infact very efficient







// class Solution {
//     public int firstMissingPositive(int[] arr) {
//          insertionSort (arr);
//          // now the array will be sorted 
//          //now i need to find the first missing positive 
//          // and for that i need to find the index from where positive number starts
//          // for that I am using binary search
//          int start = 0; 
//          int end = arr.length-1;
//          // in this binary search, start will be the answer because all end indexes are possible answer but i need smallest index containing positive number
//          int k = 0; // this will be the first positive index (not missing,just the first positive index in the sorted array)
//          while(start <= end){
//              int mid = start + (end- start)/2;
//              if(arr[mid] <= 0){
//                   //  excluded zero because I need the index of first positive number,and 0 isn't a positive number
                 
//                  start = mid + 1;
//                  k = start;

//              }
//              else {
//                  end = mid -1;
//              }
//          }
//          // now we have found the fisrt positive index of sorted array
//          // now  will run the loop on sorted array from index k to last to find missing positive number
//          // and remember that first missing positive number will be 1 if 1 is not present in the array

//          int count = 1;
//          if(k== arr.length){ // this means that the array only contains negative number,so return 1

//              return 1;
//          }

//          for(int i = k; i < arr.length; i++){
//              if(arr[i] != count){ 
//                  if( i > 0 && arr[i] == arr[i-1]){
//                      count--;
//                  }
//                else{
//                     return count ;
//                }
//              }
//             count ++;  //count ++ because next time the number needs to be 2 
//          }
//          // control reached till here, this means the anu number was missing, that's why return the next positive element 
//          return arr[arr.length-1] + 1;
//     }

//  static void insertionSort(int[] arr) {

//         // first loop will run till n-2
//        for(int i = 0; i < arr.length -1; i++){
        
//         for(int j = i+1; j > 0 ; j--){
//            if(arr[j] < arr[j-1]){
//             // swap two numbers
//             swap(arr,j,j-1); 
//            }
//            else{  // if element at j position will be >= element at j-1, this means the array behind it will be already sorted
//             break;
//            }
//         }
//        }
//     }

//     static void swap(int[] arr, int first, int second){
//         int temp = arr[first];
//          arr[first] = arr[second];
//          arr[second] = temp;
//     }
// }