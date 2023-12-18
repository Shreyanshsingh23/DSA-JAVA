//QUESTION 
// You are given a class Solution and its main method in the editor.
// Your task is to create the class Add and the required methods so that the code prints the sum of the numbers passed to the function add.

// Note: Your add method in the Add class must print the sum as given in the Sample Output

// Input Format

// There are six lines of input, each containing an integer.

// Output Format

// There will be only four lines of output. Each line contains the sum of the integers passed as the parameters to add in the main method.

// Sample Input

// 1
// 2
// 3
// 4
// 5
// 6
// Sample Output

// 1+2=3
// 1+2+3=6
// 1+2+3+4+5=15
// 1+2+3+4+5+6=21public 

import java.util.*;
class varargs_question_solution_hackerrank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter six numbers :");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        int n5 = sc.nextInt();
        int n6 = sc.nextInt();

        Add obj = new Add();
        obj.add(n1,n2);
        obj.add(n1,n2,n3);
        obj.add(n1,n2,n3,n4,n5);
        obj.add(n1,n2,n3,n4,n5,n6);

    }
    
}

class Add{
    
    static void add(int...arr){
         int sum = 0;
         for (int i = 0; i < arr.length-1; i++) {
             System.out.print(arr[i] + "+");
             sum = sum + arr[i];
         }
         sum = sum + arr[arr.length-1];
         System.out.print(arr[arr.length-1] + "=" + sum);
         System.out.println();
        }
    }
