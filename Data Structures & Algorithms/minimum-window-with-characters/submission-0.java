class Solution {
    public String minWindow(String s, String t) {
        
        Map<Character, Integer> map = new HashMap<>();

        int left = 0;
        int missing = t.length(); 

        int bestStart = 0; 
        int minLength = Integer.MAX_VALUE; 

        for (char c : t.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1); 
        }


        for (int right = 0; right < s.length(); right++){
            char c = s.charAt(right); 

            if (map.containsKey(c)){
                if (map.get(c) > 0){
                    missing--; 
                }
                map.put(c, map.get(c) - 1); 
            }

            while (missing == 0){
                if (right - left + 1 < minLength){
                    minLength = right - left + 1; 
                    bestStart = left; 
                }
                char l = s.charAt(left); 
                if (map.containsKey(l)){
                    map.put(l, map.get(l) + 1);
                    if (map.get(l) > 0){
                        missing ++; 
                    }
                }
                left++;
            }
            
        }
        if (minLength == Integer.MAX_VALUE){
                return "";
        }
        return s.substring(bestStart, bestStart + minLength);




       
        
    }
}
