// Push and pop. stack is index not the value. 
// create array
// for loop -> for each, while stack is not empty && temps[i] > temps[stack.peek()]
// stack.pop, save array[stack.pop] = current index - stack.pop
// if stack is empty OR temps[current] is smaller than temps[stack.peek], just push. 

class Solution { 
    public int[] dailyTemperatures(int[] temps) {
        
        Deque<Integer> stack = new ArrayDeque<>();
        int[] answer = new int[temps.length]; 

        for (int i = 0; i < temps.length; i++){
            while (!stack.isEmpty() && temps[i] > temps[stack.peek()]){
                int before = stack.pop();
                answer[before] = i - before; 
            }
            stack.push(i); 
        }
        return answer; 
        
    }

}

