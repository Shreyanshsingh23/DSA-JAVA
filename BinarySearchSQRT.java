public class BinarySearchSQRT {
    public static void main(String[] args) {
        int n = 40;
        int p = 8;
        
        double ans = sqrt(n,p);
        System.out.printf("%.8f",ans);
    }

    static double sqrt(int n , int p){
        
        int s = 0; 
        int e = n;
        double root = 0;
        
        while(s<= e){
            int m = s + (e-s)/2;

            if(m*m == n){
                return m;
            }
             if (m*m > n){
                e= m-1;
             }
             else{
                s = m+1;
             }
        }

        root = e;

        double increment = 0.1;
        for(int i = 0; i < p; i++){
            while (root*root < n){
                root += increment;
            }

            root = root - increment;
            increment /= 10;
        }
        
        return root;
    }
    
}
