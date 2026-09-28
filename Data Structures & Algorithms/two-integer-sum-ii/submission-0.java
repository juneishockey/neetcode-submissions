class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int frontIndex = 0; 
        int endIndex = numbers.length - 1; 
        int[] arr = new int[2];
        

        while (frontIndex < endIndex){

            if ((numbers[frontIndex] + numbers[endIndex]) > target){
                endIndex --; 
            } else if ((numbers[frontIndex] + numbers[endIndex]) < target){
                frontIndex ++;
            }
        
            if ((numbers[frontIndex] + numbers[endIndex]) == target){
            arr[0] = frontIndex + 1;
            arr[1] = endIndex + 1;
            return arr; 
            }
        
        }

        return new int[] {-1, -1};
    }
}
