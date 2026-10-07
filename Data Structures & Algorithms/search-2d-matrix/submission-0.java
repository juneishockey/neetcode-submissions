class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m = matrix.length; 
        int n = matrix[0].length; 
        int[] intArr = new int[m * n];

        
        for(int i = 0; i < m; i ++){
            for (int j = 0; j < n; j++){  
                intArr[i * n + j] = matrix[i][j]; 
            }
        }

        int left = 0;
        int right = intArr.length - 1;
        

        while (left <= right){
            int mid = left + (right - left) / 2; 
            
            if (intArr[mid] == target){
                return true;

            } else if (intArr[mid] > target){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return false; 

    }
}
