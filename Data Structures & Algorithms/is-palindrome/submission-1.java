class Solution {
    public boolean isPalindrome(String s) {
    
        char[] sToCharArr = s.toCharArray();

        int left = 0; 
        int right = s.length() - 1; 

        while (left < right){
            char leftLwr = Character.toLowerCase(sToCharArr[left]);
            char rightLwr = Character.toLowerCase(sToCharArr[right]); 

            if (!Character.isLetterOrDigit(leftLwr)){
                left++; 
                continue;
            }
            if (!Character.isLetterOrDigit(rightLwr)){
                right--;
                continue;
            }
            if (leftLwr != rightLwr){
                return false; 
            }

            left++;
            right--;
        }
        return true; 
    }
}

