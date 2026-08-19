class Solution {

    public String encode(List<String> strs) {
        String result = ""; 
        for (int i = 0; i < strs.size(); i ++){
            String added = strs.get(i).length() + "#" +  strs.get(i); 
            result += added; 
        }
        return result;
    }

    public List<String> decode(String str) {
        List<String> output = new ArrayList<>();
        int i = 0; 
        while (i < str.length()){ // 2#hi2#ye
            int hashIndex = str.indexOf('#', i); // 1, i becomes 1 now. 
            int length = Integer.parseInt(str.substring(i, hashIndex)); // int 2
            String s = str.substring(hashIndex + 1, hashIndex + 1 + length); // String "hi"
            output.add(s); // stored in ArrayList output
            i = hashIndex + 1 + length; // i = 4, start at next number 
        }

        return output; 
        
    }
}


