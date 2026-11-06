// brute force: create a copy and reverse to check : O(n^2)
// two pointer comparison: O(n)
// need to take care of space + lowercase 

class Solution {
    public boolean isPalindrome(String s){

        String str = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", ""); 
        int left = 0;
        int right = str.length() - 1; 

        while (left < right){
            if (str.charAt(left) != str.charAt(right)){
                return false; 
            } else {
                left++;
                right--; 
            }
        }
        return true; 
        
    }
}

