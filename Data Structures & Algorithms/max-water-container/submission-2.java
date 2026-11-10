// width * height, find the max. 
// two pointers -> see for every step 
// width : right - left
// height : Math.min(heights[left], heights[right])
// save it 
// we only move the pointer if larger, and compare the area with max. 

class Solution {
    public int maxArea(int[] heights) {

        int left = 0;
        int right = heights.length - 1;
        int result = 0; 

        while (left < right){
            
            int width = right - left; 
            int height = Math.min(heights[left], heights[right]); 
            result = Math.max(result, width * height); 

            if (heights[left] < heights[right]){
                left++;
            } else {
                right --; 
            }
        }
        return result; 
        
    }
}


