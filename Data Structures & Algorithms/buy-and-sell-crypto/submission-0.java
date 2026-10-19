class Solution {
    public int maxProfit(int[] prices) {
        
        int buy = 0; 
        int best = 0; 

        for (int i = 0; i < prices.length; i++){
            if (prices[buy] > prices[i]){
                buy = i; 
            } else {
                best = Math.max(best, prices[i] - prices[buy]);
            }
        }

        return best; 

    }
}
