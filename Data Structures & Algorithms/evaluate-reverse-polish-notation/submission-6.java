// if arithmetic operation, then pop too do arithmetic. 
// if arithmetic done, save the new one to the stack
// if not, save as integer. 

// the last two integers are necessary when doing arithmetic operation. 

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();


        for (String t : tokens){
            switch(t) {
                case "+": 
                    stack.push(stack.pop() + stack.pop());
                    break; 
                case "-": // commutative
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b - a);
                    break; 
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break; 
                case "/": // commutative
                    int divisor = stack.pop();
                    int dividend = stack.pop();
                    stack.push(dividend / divisor);
                    break; 
                default: 
                    // if t is a number
                    stack.push(Integer.parseInt(t)); 
                    break; 
            }
        }
        return stack.pop(); 
    }
}



