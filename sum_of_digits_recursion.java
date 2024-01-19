public class sum_of_digits_recursion {
    public static void main(String[] args){
    int ans = sum(98,0);
    System.out.println(ans);
    }

    static int sum(int n,int sum){
        
        // base condition
        if(n==0){
            return sum;  // when n will become 0, there will not be any change in sum
            
        }

        // body 
         sum += n % 10;
         n = n/10;
         
         return sum(n,sum);
        
    }
}
