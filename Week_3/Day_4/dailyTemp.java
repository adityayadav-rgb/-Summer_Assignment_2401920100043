import java.util.Stack;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] daysToWait = new int[len];
        Stack<Integer> indexStack = new Stack<>();
        
        for (int i = len - 1; i >= 0; i--) {
            // Pop elements from the stack that are colder or equal to the current temperature
            while (!indexStack.isEmpty() && temperatures[indexStack.peek()] <= temperatures[i]) {
                indexStack.pop();
            }
            
            // If the stack is empty, there is no warmer day in the future
            if (indexStack.isEmpty()) {
                daysToWait[i] = 0;
            } else {
                daysToWait[i] = indexStack.peek() - i;
            }
            
            indexStack.push(i);
        }
        
        return daysToWait;
    }
}
