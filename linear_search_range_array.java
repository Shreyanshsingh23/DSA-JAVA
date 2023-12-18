public class linear_search_range_array {
    public static void main(String[] args) {

        int[] a = {23, 56, 23, 89, 45, 12, 478, 46 };

        int target = 23;
        int start = 1;
        int end = 4;
        boolean bool = boolSearch(a, target,start,end);
        int ans = indexSearch(a, target,start,end);

        System.out.println(bool);
        System.out.println(ans);
    }

    static boolean boolSearch(int[] array, int target,int start,int end) {
        if (array.length == 0) {
            return false;
        }

        for (int i = start; i < end; i++) {
            int temp = array[i];

            if (temp == target) {
                return true;
            }
        }
        return false;
    }

    static int indexSearch(int[] array, int target,int start,int end) {
        if (array.length == 0) {
            return -1;
        }

        for (int i = start; i < end; i++) {
            int temp = array[i];

            if (temp == target) {
                return i;
            }
        }
        return -1;
    }
}
