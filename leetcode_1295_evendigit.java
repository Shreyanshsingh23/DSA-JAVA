//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class leetcode_1295_evendigit {
 public static void main(String[] args) {
    int ans = 0;
    for(int i = 0; i < nums.length ; i++){
        int a = nums[i];
        int x = 0;
        while(a != 0){
            a = a / 10;
            x ++;
        }
        if(x%2 == 0){
            ans ++;
        }
    }
    return ans;


 }
 
 // Alternate method is to convert the digit into string and then take the length of the string 
 // create a fumction and then call the function foe every element of rhe array using loop
 //function will check that whether number contains even digits or not
 // return type will be boolean
 // if length of string is even then counnt++
 // as simple as that
   
    
}
