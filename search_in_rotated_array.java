public class search_in_rotated_array {
    public static void main(String[] args){
        int  [] arr = {4,5,6,7,8,1,2,3};
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
            else if (arr[start] <= arr[mid]){
                start = mid + 1;  // start = mid isliye nhi kiye kyuki maanlo agr iss array ka pivot i.e. arr[4] = 8 , mid element hota toh vo pehle case me hi pakad me aa jata fir isliye yeh wala case pivot element ko mid maante huye banaya hi nhi gaya hai
                end = mid  - 1;
            }
        }
        return -1; // returning -1 means array was sorted
    }
}
