public class find_min_value_of_array {
    public static void main(String[] args) {
        int[] arr = {24,46,67,-75,45,90};

        int ans = findMin(arr);
        System.out.println(ans);

    }  

    // function whch returns minimum value from array
    static int findMin(int[] array){
        int a = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            
            if(array[i] < a){
                a = array[i];

            }

        }
        return a ;
    }

}