class Solution {
    public int maxArea(int[] heights) {

        int biggestArea = 0;
        int n = heights.length;
        
    
        int front = 0; 
        int end = n - 1;

        while (front < end){
            int width = end - front; 
            int height = Math.min(heights[front], heights[end]); 
            biggestArea = Math.max(biggestArea, width * height); 

            if (heights[front] < heights[end]){
                front ++; 
            } else {
                end --; 
            }
        }
        return biggestArea; 

    }
}


// need to find width = (end - front)
// nedd to find height = numbers from : int[] heights
// need to compare area = (width * height)
// save the biggest area so in biggestArea, renew if bigger shows up.