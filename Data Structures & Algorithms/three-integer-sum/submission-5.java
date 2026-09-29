class Solution {
    public List<List<Integer>> threeSum(int[] sortedNums) {
        
        Arrays.sort(sortedNums); 
        int n = sortedNums.length;
        List<List<Integer>> triplets = new ArrayList<>(); 
        

        for (int i = 0; i < n - 2; i++ ){
            
            if (i > 0 && sortedNums[i] == sortedNums[i-1]){
                continue; 
            }

            int left = i + 1;
            int right = n - 1; 

            while (left < right){
                int target = sortedNums[i] + sortedNums[left] + sortedNums[right]; 

                if (target == 0){
                    triplets.add(Arrays.asList(sortedNums[i], sortedNums[left], sortedNums[right])); 
            
                    while (left < right && sortedNums[left] == sortedNums[left + 1]){
                        left++; 
                    }
                    while (left <right && sortedNums[right] == sortedNums[right - 1]){
                        right--; 
                    }
                    left ++; 
                    right --; 

                } else if (target < 0){
                    left ++; 
                } else {
                    right--; 
                }

            }
        }
        return triplets; 
    }
}
