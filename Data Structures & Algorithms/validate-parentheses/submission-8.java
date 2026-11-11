// save the opening brackets in stack only
// closing brackets -> peek and take out stack. pop to move on. 

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i); 

            if (c == '{' || c == '(' || c == '['){
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false; 
            
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
            }
            }
        }
        return stack.isEmpty();  
    }
}









