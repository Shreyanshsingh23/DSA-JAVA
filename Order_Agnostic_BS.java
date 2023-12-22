public class Order_Agnostic_BS{
    public static void main(String [] args){
        int [] arr = {2,4,8,12,45,56,78,89,90,};
        int target = 7;
        int answer = binarySearch(arr,target);
        System.out.println("Index of target element is " + answer);
    }
    
    static int binarySearch(int [] array , int target){

        int start = 0;
        int end = array.length - 1;

         int mid = (start + end) / 2;
         boolean isAsc = array[0] < array[array.length - 1] ;

       
        

        

        while(start <= end){
           
              if(array[mid] == target ){
            return mid;
         }

         else if(isAsc){ 

            if(array[mid] < target){
                start = mid + 1;
            }
            else if (array[mid]  > target){
                end = mid -1;
            }
        }

            else { 
            if(array[mid] < target){
                
                end = mid -1;
            }
            else if (array[mid]  > target){
                start = mid + 1;
            }
        }
        }
            return -1;
    }

        // control reached till here 
        // this means the target element is not present in the array

    
    }

