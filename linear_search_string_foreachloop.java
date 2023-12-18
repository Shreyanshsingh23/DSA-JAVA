public class linear_search_string_foreachloop {
    public static void main(String[] args) {
        String name = "Shreyansh";

        char target = 'S';
        boolean bool = isPresent(name,target);

        System.out.println(bool);

        

    }
static boolean isPresent(String str, char tar){ 
    char[] ch = str.toCharArray();

    if(str.length() == 0){
        return false;
    }
        for(char e : ch){
            if(e == tar){
                return true;

            }
            
        }
        return false;
}

}