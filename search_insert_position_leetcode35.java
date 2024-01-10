//https://leetcode.com/problems/search-insert-position/
public class search_insert_position_leetcode35 {

    public static void main(String[] args){
        int [] arr = {1,3,5,6};
        int target = 5;
        int index = findIndex(arr,target);
        System.out.println(index);
    }

    private static int findIndex(int[] arr, int target) {
        int ans = 0;
      int start = 0;
      int end = arr.length-1;
      while(start <= end){
          int mid = start + (end - start ) /2;
          if(arr[mid] < target){
              start = mid + 1;
          }
          else if(arr[mid] > target){
              end = mid -1;
          }
          else if(arr[mid] == target){
              ans = mid;
          }
          else{
              ans = -1;
              }
      }
      if(ans != -1){
          return ans;
      }  
      start = 0;
      end = arr.length -1;

        int mid = 0;
      while(start <= end){
         mid = start + (end - start ) /2;
            if(arr[mid] < target){
              start = mid + 1;
          }
          else if(arr[mid] > target){
              end = mid -1;
          }
      }

      if(arr[mid] > target){
          ans = mid -1;
           }
           
     else if(arr[mid] < target){
          ans = mid +1;
           }

           return ans;
    }

    
}



