public class set_nth_bit {
    public static void main(String[] args) {
        int number  = 7;
        int n = 2;
        int mask = 1 << (n-1);
        int ans = number | mask;
        System.out.println(ans);
    }
}
