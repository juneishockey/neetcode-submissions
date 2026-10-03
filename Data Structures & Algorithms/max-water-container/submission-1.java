class Solution {
    public int maxArea(int[] heights) {

        int maxArea = 0;
        int n = heights.length; 
        int left = 0; 
        int right = n - 1;
   

        while (left < right){
            int width = right - left;
            int height = Math.min(heights[left], heights[right]); 
            maxArea = Math.max(maxArea, height * width);

            if (heights[left] < heights[right]){
                left++;
            } else {
                right--; 
            }

        }
        return maxArea; 
    }
}


// need to find width = (end - front)
// nedd to find height = numbers from : int[] heights
// need to compare area = (width * height)
// save the biggest area so in biggestArea, renew if bigger shows up.