// while left < right: 
// if left height > right height -> check right height, update. 
// if left height < right height -> check left height, update. 

class Solution {
    public int trap(int[] height) {

        int left = 0; 
        int right = height.length - 1; 
        int leftMax = 0; 
        int rightMax = 0; 
        int trappedWater = 0; 

        while (left < right){
            if (height[left] > height[right]){
                rightMax = Math.max(rightMax, height[right]);
                trappedWater = trappedWater + (rightMax - height[right]);  // adding onto. 
                right --; 
            } else {
                leftMax = Math.max(leftMax, height[left]); 
                trappedWater = trappedWater + (leftMax - height[left]);
                left ++; 
            }
        }
        return trappedWater; 
    }
}


