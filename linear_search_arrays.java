public class linear_search_arrays {
    public static void main(String[] args) {

        int[] a = { 56, 23, 89, 45, 12, 478, 46 };

        int target = 23;
        boolean bool = boolSearch(a, target);
        int ans = indexSearch(a, target);

        System.out.println(bool);
        System.out.println(ans);
    }

    static boolean boolSearch(int[] array, int target) {
        if (array.length == 0) {
            return false;
        }

        for (int i = 0; i < array.length; i++) {
            int temp = array[i];

            if (temp == target) {
                return true;
            }
        }
        return false;
    }

    static int indexSearch(int[] array, int target) {
        if (array.length == 0) {
            return -1;
        }

        for (int i = 0; i < array.length; i++) {
            int temp = array[i];

            if (temp == target) {
                return i;
            }
        }
        return -1;
    }
}
