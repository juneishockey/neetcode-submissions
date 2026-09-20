class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || minStack.peek() >= val){
            minStack.push(val);
        }

    }
    
    public void pop() {
        int p = stack.pop();
        if (!minStack.isEmpty() && p == minStack.peek()){
            minStack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
        
    }
    
}
/**
for loop everytime we need: O(n). Need O(1)

- use two stacks: 
    1. main stack we will store values
    2. min stack that will count min values

- if val is smaller than whats already in minStack,  push it to min stack. 

- if stack.pop is equal to minstack.peek then pop minstack. 
**/




















