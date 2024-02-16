public class power_of_n_by_bit_operators {
    public static void main(String[] args){
        // solving b raised to power n
        int base = 3;
        int n = 6;
        
        //int ans = solve(base,n);
        int ans = solveByrecursion(base,n,1);
        System.out.println(ans);
    }

     static int solve(int base, int n) {
       
        int ans = 1;

        while(n != 0){ 
        
        if((n&1) == 1){
            ans = ans * base;
        }
        base *= base;
        
        n = n>>1;


    }
       return ans;
    }

    static int solveByrecursion(int base, int n,int ans) {
       
        

        // base condition

        if(n == 0){
            return ans;
        }
        

        
        
        if((n&1) == 1){
            ans = ans * base;
        }
        base *= base;
        
       return solveByrecursion(base,n>>1,ans);
    }


}
