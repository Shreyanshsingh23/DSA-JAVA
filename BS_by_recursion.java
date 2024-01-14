public class BS_by_recursion {
    public static void main(String[] args) {
        int [] arr= {2,4,6,8,10,14,16,18};
        int target = 17;
        int ans =  search(arr, target, 0, arr.length-1);
        System.out.println(ans);
    }

    static int search(int[] arr, int target, int start, int end)
{
    // base condition
    // where recursion will break, otherwise it will become infinite loop because calling itself continous is similar to loop
    if(start > end){
        return -1; // this means target element was not found in array
    }

    int mid = start + (end - start)/2;

    if(arr[mid] == target){
        return mid;
    }
    if(arr[mid] > target){
        return search(arr, target, start, mid-1);
    }
    
    // now only one condition lefts i.e. arr[mid] < target

    return search(arr, target, mid + 1, end);
    
}

}
