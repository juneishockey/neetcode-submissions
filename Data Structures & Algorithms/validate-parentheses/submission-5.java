class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i <s.length(); i++){
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{' ){
                stack.push(c); 
            } else {
                if (stack.isEmpty()){
                    return false;
                }
                if (c == ')' && stack.pop() != '('){ return false;}
                if (c == '}' && stack.pop() != '{'){ return false;}
                if (c == ']' && stack.pop() != '['){ return false;}
            }

        
        }

        if (stack.isEmpty()){
            return true; 
        }
        return false;
    }
}


/** 
Logic: 

- save the opening brackets to stack:
    convert string s to char
    for loop String s
    if (, {, [, then push to stack. 

- if encounter closing bracket, peek and see if they match. 
    continue looping,
    3 if statements: 
        if ),},], then peek from the stack, and compare. 
        if they match, pop. 
        if they dont, return false right away. 

- return false if dont match, if match, repeat step two until the stack is empty. 
    if stack is empty, then return 

**/ 







