public class patterns{
    public static void main(String[] args) {
        printPattern(5);
    }
    static void printPattern(int n){
       
        for(int row = 1; row < 2*n  ; row++){
            
            if(row<n){
                for(int col = 0;col <row;col++){
                    System.out.print("* ");
                }
               
            }
            else{
                for(int col = 0;col <n  - (row-n);col++){
                    System.out.print("* ");
                }
            }
             System.out.println();
        }

        // right side part

         for(int row = 1; row < 2*n  ; row++){
            //for upper half
            if(row<n){
                
                    for(int i = 0; i < n- row;i++){

                        System.out.println(" ");
                    }
                    for(int i = 0; i < row;i++){ 
                    System.out.print("* ");
                }
            }
               
            // for lower half
            
            else{
                
                    for(int i = 0; i < row-n;i++){ 
                    System.out.print(" ");
                    }

                     for(int i = 0; i < n - (row - n) ;i++){ 
                    System.out.print(" ");
                }
                
            }
             System.out.println();
        }
        
    }
}

