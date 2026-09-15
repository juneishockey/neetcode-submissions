class Solution {
    public boolean isValid(String s) {
        
        Map<Character, Character> pairs = new HashMap<>();
        pairs.put(')', '(');
        pairs.put('}', '{');
        pairs.put(']', '[');

        Stack<Character> stack = new Stack<>();
        char[] array = s.toCharArray(); 

        for (int i = 0; i < array.length; i ++){
            if (array[i] == '(' || array[i] == '{' || array[i] == '['){
                stack.push(array[i]);
            } 
            if (array[i] == ')' || array[i] == '}' || array[i] == ']'){
                if (stack.isEmpty() || !stack.pop().equals(pairs.get(array[i]))){
                    return false; 
                }
            }
        }
        return stack.isEmpty(); 
    }
}



/** 

Logic:
put s to an array, using for loop.

go through and push opening brackets onto the stack. 

when encounter a closing bracket, 
we need to verify the stack is not empty, if it is, return false. 
then we need to pop the latest on from the stack and compare. 

**/ 







