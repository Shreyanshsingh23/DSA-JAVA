import java.util.ArrayList;
import java.util.List;

public class leetcode1481 {
    
  
        public static void main(String[] args) {
            
            int[] arr = {3,5,5,5};
            int k = 1;
            
            if(arr.length == k){
              //  return 0;
              System.out.println(0);
            }
           if(arr.length == k+1){
               // return 1;
                System.out.println(1);
            } 
            int count = k;
            sort(arr);
            
            List<Integer> list = new ArrayList<Integer>();
            
          int i = 0;
            while(count>0){
             
               if(i==0){
                 list.add(arr[0]);
               }
                
                else if(arr[i] == arr[i-1]){
                    
        
                        continue;
                    }
                else{
                    list.add(arr[i]);
                }
                
                count--;
                i++;
                
         }
            int unique = 1;
            
            for(int j = 0; j < arr.length -1; j++){
                if(arr[j] == arr[j+1]){
                    continue;
                }
                unique ++;
            }
            
            //return (unique - k);
            System.out.println("unique -> " + unique);
            System.out.println(unique - k + "....");
            
        }
        
        static void sort(int[] arr){
    
       for(int i = 0; i < arr.length -1; i++){
            
            for(int j = i+1; j > 0 ; j--){
               if(arr[j] < arr[j-1]){
                // swap two numbers
                swap(arr,j,j-1); 
               }
               else{  // if element at j position will be >= element at j-1, this means the array behind it will be already sorted
                break;
               }
            }
           }
        }
    
        static void swap(int[] arr, int first, int second){
            int temp = arr[first];
             arr[first] = arr[second];
             arr[second] = temp;
        }
    }
