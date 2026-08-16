class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i ++){
            if (map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());

        entryList.sort((a,b) -> b.getValue() - a.getValue());

        int[] kElement = new int[k];

        for (int i = 0; i < k; i++){
            kElement[i] = entryList.get(i).getKey();
        }

        return kElement; 

    }
}
