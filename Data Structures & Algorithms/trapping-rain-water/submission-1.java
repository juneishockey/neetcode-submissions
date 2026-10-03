class Solution {
    public int trap(int[] height) {
        
        int left = 0; 
        int right = height.length - 1; 

        int leftMax = 0;
        int rightMax = 0;

        int trapWater = 0;

        while (left < right){
            if (height[left] < height[right]){
                leftMax = Math.max(height[left], leftMax);
                trapWater = trapWater + (leftMax - height[left]);
                left ++;
            } else { 
                rightMax = Math.max(height[right], rightMax);
                trapWater = trapWater + (rightMax - height[right]); 
                right --;
            }

        }  
        return trapWater;   


       

    }
}


// in between only. 
// min (height[l] - height[m]) - heigth[i]
// distance between the two walls 
// subtract heights in between 
