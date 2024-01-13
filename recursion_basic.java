public class recursion_basic {
   public static void main(String[] args){
    print1(1);
    System.out.println("Main function ended.");
   }

   static void print1(int n){
    System.out.println(n);
    print2(2);
    System.out.println("Print 1 function ended.");
   }
   static void print2(int n){
    System.out.println(n);
    print3(3);
    System.out.println("Print 2 function ended.");
   }
   static void print3(int n){
    System.out.println(n);
    print4(4);
    System.out.println("Print 3 function ended.");
   }
   static void print4(int n){
    System.out.println(n);
    print5(5);
    System.out.println("Print 4 function ended.");
   }
   static void print5(int n){
    System.out.println(n);
    System.out.println("Print 5 function ended.");
    
   }
   
    
}
