import java.util.Arrays;

public class palindrome_string_recursion {
    public static void main(String[] args){
        //String s = "Marge, let's \"[went].\" I await {news} telegram.";
//          //String s = "A man, a plan, a canal: Panama";
//          String s ="0P";
//         s = s.toLowerCase();

//         //String[] arrOfStr = s.split("['!?,|{}\\:#%$&*\"._@ ]+");    
//         // String[] arrOfStr = s.split("[^a-zA-Z]+");
//         String[] arrOfStr = s.split("[^a-zA-Z0-9]+");

//         s = "";
//         for(int i = 0; i < arrOfStr.length ; i++){
//             s = s + arrOfStr[i];
//         }

//         System.out.println(s);

//         boolean bool = check (s,0,s.length()-1);
//         System.out.println(bool);
        

//     }

    
    
    
    
//     static boolean check(String s,int start ,int end){
        

//         // base condition

//         if(start > end){
//             return true;
//         }

//         // body

//             // edge case
//        if(s == null || s.length() == 0){
//         return true;
//        } 

//        if(s.charAt(start) != s.charAt(end)){
//         return false;
//        }

//       // if(s.charAt(start) == || )

//        return check(s,start+1,end-1);
        
        
        
//     }
    
// }

int [] arr = {7,3,1,6,0,0};
sort(arr);
System.out.println(Arrays.toString(arr));   
}


static void swap(int[] arr, int f , int s){

    int temp = arr[f];
    arr[f]= arr[s];
    arr[s]= temp;
}


static void sort(int[] arr){
    int n = arr.length;
    
    for(int i = 0 ; i < n -1; i++){

        for(int j = i+1 ; j >0 ; j--){
            if(arr[j] < arr[j-1]){
                swap(arr,j-1,j);
            }
            else{
                break;
                 }
        }
        
    
    }
}
    
}
