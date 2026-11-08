// # to seperate words and number. 
// use substring to decode

class Solution {

    // hello world -> 5#hello5#world
    public String encode(List<String> strs) {
        String encoded = "";
        for (String s : strs){
            encoded += s.length() + "#" + s; 
        } 
        return encoded;    
    }

    // 5#hello5#world
    public List<String> decode(String str) {
        List<String> list = new ArrayList<String>();

        int i = 0; 
        while (i < str.length()){
            int j = i; 
            while (str.charAt(j) != '#'){
                j++;
            }
            String combine = str.substring(i, j); 
            int number = Integer.parseInt(combine); // finding the number before #

            i = j + 1 + number; // set i after the number for the next one
            String word = str.substring(j + 1, i); // word is from j + 1 to the next i
            list.add(word);
        }
        return list; 
    }
}


