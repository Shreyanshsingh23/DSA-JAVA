public class sieve_of_Eratosthenes {
    public static void main(String[] args) {
        int n = 81;
        boolean [] primes = new boolean[n+1]; 
        // n+1 because every index number is treated as value of n
        // and we need to include 40 also so we need array of 41 elements

        isPrime(n,primes);

    }

    static void isPrime(int n, boolean[] primes) {

        // every element of a boolean array is false in default
        // so elements which will be left as false in end will be prime numbers

        for(int i = 2; i*i <= n ; i++){
            // we will check till numbers only less than sqrt of n because after that pairs start repeating
            if(!primes[i]){
                for(int j = i*2; j <= n;j+=i){
                    primes[j] = true;  // every multiple of i will be flipped to ture,
                    // this shows that this element is a multiple of a number which has alredy appeared before so this can't be a prime number
                }
            }
        }

        for(int i = 2; i <=n; i++){
            if(!primes[i]){
                System.out.print(i + " ");
            }
        }
    }
}