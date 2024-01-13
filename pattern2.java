public class pattern2 {
    public static void main(String[] args) {
      printPattern(5);
    }

    static void printPattern(int n){
        for(int row = 0; row < 2*n ; row++){
             int cols = row <= n ? row : 2*n - row ;

             for(int j = 0; j < n - cols ; j++){
                    System.out.print(" ");
             }

             // print stars

             
             for(int j = 0; j < cols; j++){
                System.out.print("* ");
         }

         System.out.println();
        }
        
    }

}
