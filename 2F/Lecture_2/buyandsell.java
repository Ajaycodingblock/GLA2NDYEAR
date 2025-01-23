public class buyandsell {
    class Solution {
        public int maxProfit(int[] prices) {
            // int minbuy = Integer.MAX_VALUE;
            // int maxprofit = 0;
            // for(int i = 0;i<prices.length;i++){
            //     minbuy = Math.min(minbuy,prices[i]);
            //     maxprofit = Math.max(maxprofit,prices[i] - minbuy);
            // }
            // return maxprofit;
    
         int mp=Integer.MAX_VALUE;
         int ans=0;
          for(int p:prices)
          {
            if(p<mp)
            {
                mp=p;
            }
            else
            {
        ans=Math.max(ans,p-mp);
            }
          }
          return ans;
        }
    }
    
    
    
    
    
    
    
    
    
}
