import java.util.*;
public class linear_search_string {
    public static void main(String[] args) {
        
        String name = "Shreyansh Singh Gautam";

        char target = 'S';

        boolean bool = search(name,target);

        System.out.println(bool);

        int ans = search_index(name, target);
        System.out.println(ans);
    }

    static boolean search(String s, char target){

        if(s.length() == 0){
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char element = s.charAt(i);       // retreiving the character one-by-one to compare with target element
            if(element==target){
                return true;
            }

        }
        return false;           // bcz if control reaches till this line this means that target element was not present in string
    }

    static int search_index(String s, char target){

        
        if(s.length() == 0){
            return -1;
        }
        for (int i = 0; i < s.length(); i++) {
            char element = s.charAt(i);       // retreiving the character one-by-one to compare with target element
            if(element==target){
                return i;
            }
        }
              
            return -1;
    
}

}
