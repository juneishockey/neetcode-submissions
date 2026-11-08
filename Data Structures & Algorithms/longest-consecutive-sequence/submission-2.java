// brute force: go thru each, worst case: O(n^3)
// if num - 1 doesnt exist, we start from there. 

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int count = 0; 

        // added to the set
        for (int n : nums){
            set.add(n);
        }

        int longest = 0; 

        // check if n-1 exist in the set, if not, becomes new start and add. 
        for (int n : set){
            if (!set.contains(n - 1)){
                int start = n;
                int length = 1; 

                while (set.contains(start + 1)){
                    start ++; 
                    length ++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest; 
    }
}
