// brute force: check every possible option O(n^2)
// use hashmap: target - current = x, if map(index) contains: true
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++){
            int current = nums[i]; 
            int x = target - current; 
            
            if (map.containsKey(x)){
                return new int[] {map.get(x), i};
            } else {
                map.put(current, i);
            }
        }
        return new int[] { -1, -1};
    }
}





