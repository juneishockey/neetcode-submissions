// sort it, go thru once
// run a loop, treat the current as first of triplet
// two other numbers that sum up to current - two pointers on the rest.
// if nums[i] == nums[i - 1] you skip. 
// after we found, move nums[i] to nums[l]
// if nums[i] > 0, we stop, nothing can be be negative. 


class Solution {
    public List<List<Integer>> threeSum(int[] sortedNums) {
        
        Arrays.sort(sortedNums);
        List<List<Integer>> triplets = new ArrayList<>();

        for (int i = 0; i < sortedNums.length; i++){
            int current = sortedNums[i]; 
            int left = i + 1; 
            int right = sortedNums.length - 1; 
            

            if (sortedNums[i] > 0){
                break; 
            }
            if (i > 0 && sortedNums[i] == sortedNums[i - 1]){
                continue; 
            }

            while (left < right){
                int sum = sortedNums[left] + sortedNums[right] + sortedNums[i];
                if (sum == 0){
                    triplets.add(Arrays.asList(sortedNums[i], sortedNums[left], sortedNums[right])); 
                    left ++; 
                    right --; 
                    current = left;
                    while (left < right && sortedNums[left] == sortedNums[left - 1]){
                        left++;
                    }
                } else if (sum > 0){
                    right --; 
                } else {
                    left ++; 
                }
            }
        }
        return triplets; 
        
    }
}
