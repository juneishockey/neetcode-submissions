class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int left = 0;
        int right = numbers.length - 1;
        int[] sumArr = new int[2];

        while (left < right){

            int sum = numbers[left] + numbers[right]; 

            if (sum < target){
                left ++; 
               

            } else if (sum > target){
                right --; 
               
            } else {
                sumArr[0] = left + 1;
                sumArr[1] = right + 1;
                return sumArr; 
            }
            
        }
        return new int[] {-1, -1}; 
        
    }
}

// super important --> non-decreasing order --> increasing or same
