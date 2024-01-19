public class nth_fibonacci_by_recursion {

    static int count ;
    public static void main(String[] args){
        int ans = fibo(40);
        System.out.println(ans);
        System.out.println("No. of times fibo function has been called = " + count);

    }

    static int fibo(int n){

        count ++;
        // base condition 
        if(n < 2){
            return n;
        }

        // recurrence relation
        return fibo(n-1) + fibo(n-2);
    }
}
