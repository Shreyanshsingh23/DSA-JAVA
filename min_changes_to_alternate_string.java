//https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string/editorial/?envType=daily-question&envId=2023-12-24

public class min_changes_to_alternate_string {
    public static void main(String[] args){
        String s = "10010100";  // minimum changes we neend to make in this string are 3

        int  count = 0;
        
   
         for(int i = 0; i < s.length(); i++){

            if(s.length() == 1){break;}
           if(i % 2 == 0 && s.charAt(i) == '1'){
               count++;
           }
             if(i % 2 == 1 && s.charAt(i) == '0'){
               count++;
           }
    
       }
       
          System.out.println(Math.min(count,s.length() - count)); 

        
    }
}
