// brute force: literally go thru every option O(n^2 * k)
// HashMap: sort letters and compare. O(n* k log k)? 
// HashMap: letter count as key O(n * m)

/** 
ascii alphabets : 'a' is 97
a - a = 0
b - a = 1 
c - a = 2
.... 
z - a = 25 
we need total 26 slots to store these lowercase alphabets

*/ 


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>(); 

        // each word
        for (String s : strs){
            int[] count = new int[26]; 

            // each character
            for (char c : s.toCharArray()){
                count[c - 'a'] ++;   
            }

            // save the array to string, and compare
            String array = Arrays.toString(count); 
            if (!map.containsKey(array)){
                map.put(array, new ArrayList<>()); // one specific array == one word
            }
            map.get(array).add(s);
            
        }
        return new ArrayList<>(map.values()); 
    }
}
