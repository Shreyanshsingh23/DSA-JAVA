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
 
   
    
}
