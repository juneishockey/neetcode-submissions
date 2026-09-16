class MinStack {

    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public MinStack() {
    
    }
    
    public void push(int val) {
        mainStack.add(val);
        if (minStack.isEmpty()){
            minStack.add(val);
        } else {
            int currentMin = minStack.get(minStack.size() - 1);
            minStack.add(Math.min(currentMin, val));
        }
    }
    
    public void pop() {
        mainStack.pop();
        minStack.pop();
    }
    
    public int top() {
        return mainStack.peek();
        
    }
    
    public int getMin() {
        return minStack.peek(); 
        
    }
    
}