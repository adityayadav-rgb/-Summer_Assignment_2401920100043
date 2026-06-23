import java.util.Stack;

class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> indexStack = new Stack<>();
        int maxArea = 0;
        int len = heights.length;
        
        for (int i = 0; i <= len; i++) {
            // Use a dummy height of 0 at index 'len' to flush remaining elements from the stack
            int currentHeight = (i == len) ? 0 : heights[i];
            
            while (!indexStack.isEmpty() && heights[indexStack.peek()] > currentHeight) {
                int height = heights[indexStack.pop()];
                int width = indexStack.isEmpty() ? i : i - indexStack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            indexStack.push(i);
        }
        
        return maxArea;
    }
}
