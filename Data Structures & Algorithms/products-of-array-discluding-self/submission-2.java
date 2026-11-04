// brute force: can use division, 0 might break
// everything to my left, everything to my right.

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int left[] = new int[nums.length]; 
        int right[] =new int[nums.length]; 
        int result[] = new int[nums.length]; 

        left[0] = 1; // no left when at 0index. 
        for (int i = 1; i < nums.length; i++){
            left[i] = left[i-1] * nums[i-1]; 
        } 

        right[nums.length - 1] = 1; // no right when at end. 
        for (int i = nums.length - 2; i >= 0; i-- ){
            right[i] = right[i+1] * nums[i+1];
        }

        for (int i = 0; i < nums.length; i++){
            result[i] = left[i] * right[i]; 
        }
        
        return result; 
    }
}  






