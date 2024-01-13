public class butterfly {
   public static void main(String[] args) {
    printPattern(5);
   }

   static void printPattern(int n){
       
    for(int row = 1; row < 2*n  ; row++){
        
        if(row<n){
            for(int col = 0;col <row;col++){
                System.out.print("* ");
            }

            // for(int i = 0; i < n- row;i++){

            //     System.out.print(" ");
            //     System.out.print(" ");
            // }
            // for(int i = 0; i < row;i++){ 
            // System.out.print("* ");
        // }
           
        }

        // lower half
        else{
            for(int col = 0;col <n  - (row-n);col++){
                System.out.print("* ");
            }

            for(int i = 0; i < row-n;i++){ 
                System.out.print(" ");
                }

                 for(int i = 0; i < n - (row - n) ;i++){ 
                System.out.print("* ");
            }
        }
         System.out.println();
    }

    
}
}
