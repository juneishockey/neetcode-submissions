class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int[] lastSeen = new int[256]; 
        char[] sArr = s.toCharArray(); 
     
        int left = 0;
        int maxLength = 0; 

        for (int right = 0; right < sArr.length; right++){
            char c = sArr[right]; 
            left = Math.max(left, lastSeen[c]);
            lastSeen[c] = right + 1; 
            maxLength = Math.max(maxLength, right - left + 1);
            
        }
        return maxLength; 
    }
}
