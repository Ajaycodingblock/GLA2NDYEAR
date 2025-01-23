class Solution {
    public int mySqrt(int x) {
       
        
        int lo = 0;
        int hi = x;
        
        while (lo <= hi) {
            long mid = lo + (hi - lo) /2; 
            if (mid * mid == x)
             {
                return (int) mid; 
            }
            else if (mid * mid < x) {
                lo = (int) mid + 1;  
            } 
            else {
                hi = (int) mid - 1;  
            }
        }
        
        return (int) hi; 
    }
}
