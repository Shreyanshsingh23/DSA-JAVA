public class pivot_in_duplicated_array {
    
    public static void main(String[] args){
      
         int  [] arr = {2,3,3,3,9,9,9,2,2,2}; 
        int pivot = pivot(arr);
        System.out.println(pivot);

    }

    static int pivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while(start <= end){
            mid = start + (end - start )/2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            else if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }

            // if 
              if(arr[start] == arr[mid] && arr[end] == arr[mid]){
                // but what if these extreme elements are pivots?
                // check for start element
                // condition for start element to be pivot is when it is greater than the second elelemnt

                if(arr[start] > arr[start + 1]){
                    return start;
                }

                start ++;

                // similarly check for end element

                if(arr[end] < arr[end-1]){
                    return end -1;
                }

                end-- ;
            }

                // left  side is sorted so pivot will be in right, so ignore left part
                else if(arr[start] < arr[mid] || arr[start] == arr[mid] && arr[end] < arr[mid] ){ // if end elememnt is not smaller than miidle element, then left part isn't sorted, hence pivot/greatest elememnt can lie on left side also,so we will not be able to ignore left part
                    start = mid + 1;
                }
                else{
                    end = mid -1;
                }
            
        }
        return -1; // returning -1 means array was sorted
    }
}

