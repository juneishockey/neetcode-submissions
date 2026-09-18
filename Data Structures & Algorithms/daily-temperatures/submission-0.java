class Solution { 
    public int[] dailyTemperatures(int[] temperatures) {
        
        int[] output = new int[temperatures.length];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++){
            
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int index = stack.pop();
                output[index] = i - index; 
            }
            stack.push(i);
           

        } 
        return output;
        
    }

}


/**
create an int[] array. 
save temperatures indices to stack: 
use temperature[stack.peek()] to check the top stack.  

if the stack is empty, push (nothing to compare)
if current number smaller than the stack, push and move on? push(not renewed yet)

while current number bigger than the stack, pop and subtract, repeat
    save that index difference in the int[] array and move on. 
**/ 

