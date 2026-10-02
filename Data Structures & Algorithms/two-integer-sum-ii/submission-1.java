class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int left = 0;
        int right = numbers.length - 1;
        int[] sumArr = new int[2];

        while (left < right){

            int sum = numbers[left] + numbers[right]; 

            if (left < right && sum < target){
                left ++; 
                continue;

            } else if (left < right && sum > target){
                right --; 
                continue;

            } else {
                sumArr[0] = left + 1;
                sumArr[1] = right + 1;
            }
            right--;
            left ++;
        }
        return sumArr; 
        
    }
}

// super important --> non-decreasing order --> increasing or same
