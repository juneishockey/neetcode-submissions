class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        

        int lengthP = piles.length;
        int min = 1; 

        // find max pile size 
        int max = 0;
        for (int p : piles){
            max = Math.max(max, p);
        }

        // binary search
        while (min < max){
            int mid = min + (max - min) / 2;
            
            if (canEatInTime(piles, h, mid)){
                max = mid;
            } else {
                min = mid + 1; 
            }
        }
        return min; 

    }

    private boolean canEatInTime(int[] piles, int h, int speed){
        int hours = 0; 
        for (int p : piles){
            hours += (int) Math.ceil((double) p / speed); 
        }
        return hours <= h; 
    }
}




