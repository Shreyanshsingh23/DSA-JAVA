// https://leetcode.com/problems/missing-number/

public class missing_number {
  public static void main(String[] args){
    int[] arr = {1,0,3,4,6,2};
   System.out.println(findNumber(arr));

  }    

  static int findNumber(int[] arr){

    int n = arr.length;
    
    int i = 0;

    while(i<n){
          
        int correctIndex= arr[i];
        
        if(arr[i] < arr.length && arr[i] != arr[correctIndex]){   // otheerwise index out of  bound will occur
              swap(arr,i,correctIndex);
        }
        else{
          i++;
        }
    }

        // finding missing number in the array 
        
        
        for (int index = 0; index < arr.length; index++) {
          
        
        
             
            if(arr[index] != index) {
                return index;
            }
        }
    
        return n;
    
  }

  static void swap (int [] arr, int first, int second){
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second]  = temp;
  
  }
}
