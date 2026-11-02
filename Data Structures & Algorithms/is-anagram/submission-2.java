// Brute Force: O(n^2)
// HashMap: save s, check with t O(n)

class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        
        if (s.length() != t.length()) return false; 

        // set
        for (int i = 0; i < s.length(); i++){
            if (map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1); 
            } else {
                map.put(s.charAt(i), 1); 
            }
        }

        // find
        for (int i = 0; i < t.length(); i++){
            if (map.containsKey(t.charAt(i))){
                map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
                if (map.get(t.charAt(i)) < 0){
                    return false; // t has more char
                }
            } else {
                return false; // char in t doesnt exist in s.
            }
        }

        return true; 


        
    }
}







