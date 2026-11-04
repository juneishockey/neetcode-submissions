// # seperates words

class Solution {

    public String encode(List<String> strs) {
        String string = ""; 
        for (String s : strs){
            string += s.length() + "#" + s;
        }
        return string; 
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
            int number = Integer.parseInt(combine); //5

            i = j + 1 + number; 
            String word = str.substring(j + 1, i); 
            
            list.add(word); 
        }
        return list; 
    }
}


