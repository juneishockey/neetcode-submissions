class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int length = s1.length(); 
        if (length > s2.length()) {return false;}

        int[] s1Arr = new int[26];
        int[] s2Arr = new int[26]; 

        for (int i = 0; i < length; i++){
            s1Arr[s1.charAt(i) - 'a']++; 
            s2Arr[s2.charAt(i) - 'a']++; 
        }
        if (Arrays.equals(s1Arr, s2Arr))  {return true;} 

        for (int i = length; i < s2.length(); i++){
            s2Arr[s2.charAt(i) - 'a']++;
            s2Arr[s2.charAt(i - length) - 'a']--; 
            if (Arrays.equals(s1Arr, s2Arr)) {return true; }
        }

        return false; 


    }
}
