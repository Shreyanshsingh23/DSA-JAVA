public class sliding_window_myself {
    public static void main(String[] args){
        int [] arr= {4,6,2,4,34,65,67,8,7};
        // i will try to find max sum of k  continous elements of array by sliding window method
        int k = 2;
        int sum = sumBySlidingWindow(arr,k);
        System.out.println(sum);
    }

     static int sumBySlidingWindow(int[] arr, int k) {
        int sum = 0;
        int ans = 0;
        for(int i = 0; i < k;i++){
             sum += arr[i];
            }
            for(int i = 0; i < arr.length -k +1;i++){
             if(i>0){
                sum = sum - arr[i-1] + arr[i+1];
                ans =Math.max(sum,ans);
             }
             else{
                ans = sum;
             }
            }

        
        return ans;
    }
}

