import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> monoStack = new Stack<>();
        Map<Integer, Integer> nextGreaterMap = new HashMap<>();
        
        // Traverse nums2 from right to left to find the next greater elements
        for (int i = nums2.length - 1; i >= 0; i--) {
            int currentVal = nums2[i];
            while (!monoStack.isEmpty() && monoStack.peek() <= currentVal) {
                monoStack.pop();
            }
            
            if (monoStack.isEmpty()) {
                nextGreaterMap.put(currentVal, -1);
            } else {
                nextGreaterMap.put(currentVal, monoStack.peek());
            }
            
            monoStack.push(currentVal);
        }
        
        // Construct the result array for nums1
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreaterMap.getOrDefault(nums1[i], -1);
        }
        
        return result;
    }
}
