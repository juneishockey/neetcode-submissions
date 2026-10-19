class Solution {
    public int maxProfit(int[] prices) {
        
        int buy = 0; 
        int best = 0; 
        int minPrice = Integer.MAX_VALUE; 
  

        for (int p : prices){
            minPrice = Math.min(minPrice, p);
            best = Math.max(best, p - minPrice); 
        }

        return best; 

    }
}
