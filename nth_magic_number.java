public class nth_magic_number {
    public static void main(String[] args){
        int base = 7;
        int n = 3;
        int ans = magicNumber(base, n);
        System.out.println(ans);
    }

    private static int magicNumber(int base, int n) {
        int ans = 0;
        int count = 1;
        while(n != 0){
            
            int digit = n&1;
            //ans +=  (int) (digit * Math.pow(base,count++));   // same thing which is done below in 2 lines
            ans += digit * base;
            base = base*base;
            n = n >> 1;
            
        }

        return ans;
    }

    
}
