import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        System.out.println("Hello World");

           //     ArrayList<Integer> list = new ArrayList<>();

            
        //   System.out.println(list.size());


        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i = 0; i< 3;i++){
            list.add(new ArrayList<>());
        }

        for(int i = 0; i < 3 ; i++){
            for(int j = 0; j<3;j++){
              ArrayList<Integer> sublist =   list.get(i);
            
                sublist.add(sc.nextInt());
               // System.out.println(sublist);
            }
            System.out.println(list);
        }
        
    }
}
