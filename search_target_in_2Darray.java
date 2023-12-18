public class search_target_in_2Darray{
public static void main(String[] args) {
    
    // creating a 2D Array
    int [][] arr = {
        {23,45,78,90},
        {18,7,65},
        {70,43,75},
        {12,13,14}
    };

    int num = 12;
    boolean bool = search(arr,num);
    System.out.println(bool);

}

static boolean search(int[] [] array, int target){
    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length ; j++) {
            if(array[i][j] == target){
                return true;
            }
        }
    }
      return false;
}
}

