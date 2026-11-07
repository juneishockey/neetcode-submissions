// brute force: count all, save all, compare O(n^2)
// HashMap instead of counting: save numbers, and + if same. 


class Solution {
    public int[] topKFrequent(int[] nums, int k){
        
        // save in map
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums){
            if (!map.containsKey(n)){
                map.put(n, 1); 
            } else {
                map.put(n, map.get(n) + 1); 
            }
        }

        // compare counting by creating a new list only with values
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((a,b) -> map.get(b) - map.get(a));  
        
        // result array
        int[] result = new int[k];
        for (int i =0; i < k; i++){
            result[i] = list.get(i);
        }
        return result;  
    }
}
