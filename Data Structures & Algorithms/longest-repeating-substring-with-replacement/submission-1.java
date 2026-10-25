class Solution {
    public int characterReplacement(String s, int k) {
        
        int left = 0;
        int right = 0; 
        int output = 0; 
        int maxChar = 0; 

        Map<Character, Integer> map = new HashMap<>();

        while (right < s.length()){
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1); 

            if (map.get(s.charAt(right)) > maxChar){ 
                maxChar = map.get(s.charAt(right)); 
            }

            while ((right - left + 1) - maxChar > k){
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1); 
                left++; 
            } // see if it is valid to proceed

            output = Math.max(output, right - left + 1);
            right ++; 

        }
        return output; 

        

    }
}
