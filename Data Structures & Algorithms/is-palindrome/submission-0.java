class Solution {
    public boolean isPalindrome(String s) {
        
        char[] sToCharArr = s.toCharArray();
        
        int front = 0;
        int end = sToCharArr.length - 1;

                

        while (front < end){
            char frontLwrCase = Character.toLowerCase(sToCharArr[front]); 
            char endLwrCase = Character.toLowerCase(sToCharArr[end]); 
                    
            if (!Character.isLetterOrDigit(frontLwrCase)){
                front++; 
                continue;
            }
            if (!Character.isLetterOrDigit(endLwrCase)){ 
                end--;
                continue;
            }
                    
            if (frontLwrCase != endLwrCase){
                return false; 
            }

            front++; 
            end--; 


        }
        
        return true; 

        
    }
}


// instead of deleting spaces, we'll just skip it