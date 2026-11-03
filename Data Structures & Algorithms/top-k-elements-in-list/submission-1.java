// brute force: count all, save all, compare O(n^2)
// HashMap instead of counting: save numbers, and + if same. 


class Solution {
    public int[] topKFrequent(int[] nums, int k){
        Map<Integer, Integer> map = new HashMap<>();

        // saved in map - <number, appearance>
        for (int i : nums){
            if (!map.containsKey(i)){
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1); 
            }
        }

        List<Integer> keys = new ArrayList<>(map.keySet());
        keys.sort((a ,b) -> map.get(b) - map.get(a));

        int[] result = new int[k]; 
        for (int i = 0; i < k; i++){
            result[i] = keys.get(i); 
        } 
        return result; 
    }
}
