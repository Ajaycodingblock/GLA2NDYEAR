public class plaimdrone9 {
    
    class Solution {
        public boolean isPalindrome(int x) {
            int sum = 0;
            int copy = x;
            while(x>0){
                int rem = x%10;
                sum = sum*10 + rem;
                x = x/10;   
            }
            
                 if(copy == sum){
                    return true;
                }
            return false;
        }
    }
}
