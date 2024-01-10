// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/

import java.util.Arrays;

public class numbers_smaller_than_current_num_in_array {
    public static void main(String [] args){
       
//         int count ;
//         int [] arr = new int[nums.length];
//         for(int i = 0; i < nums.length ; i++){
//              count = 0;
//             for(int j = 0; j < nums.length ; j++){
//                if(nums[j] < nums[i]){
//                    count++;
//                }
                
//             }
//             arr[i] = count;
//         }
//         return arr;

   // Now by insertion Sort
    int [] nums = {8,1,2,2,3};

   int [] arr = new int[nums.length]; 
   for(int i = 0;i < nums.length -1; i++){
       for(int j= i+1 ; j> 0;j--){
           if(nums[j] < nums[j-1]){
               swap(nums,j,j-1);
           }
           else{
               break;
           }
       }
   }
//    for(int i = 0;i < nums.length ; i++){
//       arr[i] = arr.length - 1 -i;
//    }

   System.out.println(Arrays.toString(nums));

     
  }

  static void swap(int[] arr, int first , int second){
      int temp = arr[first];
      arr[first] = arr[second];
      arr[second]= temp;
    }
}
