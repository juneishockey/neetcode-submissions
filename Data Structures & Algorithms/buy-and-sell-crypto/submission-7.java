class Solution {
    public int maxProfit(int[] prices) {
        
        int left = 0;
        int bestProfit = 0; 

        for (int right = 0; right < prices.length; right++){

            int profit = prices[right] - prices[left];
            if (prices[left] >= prices[right]){
                left = right; 

            } else {
                
                bestProfit = Math.max(bestProfit, profit);
                
            }

        }
        return bestProfit; 
        
    }
}


// if left > right, move. 
// if left < right, save the gap to maxprofit so far and update
