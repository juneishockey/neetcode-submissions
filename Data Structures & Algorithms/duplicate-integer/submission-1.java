class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(); 

        for (int i = 0; i < nums.length; i++){
            if (set.contains(nums[i])){
                return true; 
            } else {
                set.add(nums[i]);
            }
        }
        return false; 
    }
}

// brute force: O(n^2)
// instead we can use set: if contains, return true, if not, save O(n). 
// if contains keeps give false, then return false.



