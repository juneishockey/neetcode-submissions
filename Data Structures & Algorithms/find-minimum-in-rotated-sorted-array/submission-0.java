class Solution {
    public int findMin(int[] nums) {
        
        int left = 0; 
        int right = nums.length - 1; 
        
        
        while (left < right){
            int mid = left + (right - left) / 2; 

            if (nums[mid] > nums[right]){
                left = mid + 1; 
            } else {
                right = mid; 
            }
        }
    
        return nums[left];

    }
}


// if n times < nums length : the last n elements move to the beginning.
// if n time = nums lenght : goes back to the original. 

// if left < right, means sorted
// if left > right, rotated, to find minimum, we must go to the right batch
// middle value : if even -- nums [nums length / 2 ] 
                  // if odd -- nums[nums length / 2 - 1]

// we move left to mid if left > right, we mvoe right to mid if vice versa. 