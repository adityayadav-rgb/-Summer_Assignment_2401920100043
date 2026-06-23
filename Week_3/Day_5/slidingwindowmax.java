import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return new int[0];
        }
        
        int totalElements = nums.length;
        int[] maxElements = new int[totalElements - k + 1];
        int resultIndex = 0;
        
        Deque<Integer> windowIndices = new ArrayDeque<>();
        
        for (int i = 0; i < totalElements; i++) {
            // Remove elements that have fallen out of the sliding window boundaries
            if (!windowIndices.isEmpty() && windowIndices.peekFirst() < i - k + 1) {
                windowIndices.pollFirst();
            }
            
            // Remove elements from the deque that are smaller than the current element
            while (!windowIndices.isEmpty() && nums[windowIndices.peekLast()] < nums[i]) {
                windowIndices.pollLast();
            }
            
            windowIndices.offerLast(i);
            
            // Add the maximum element of the current window to the result array
            if (i >= k - 1) {
                maxElements[resultIndex++] = nums[windowIndices.peekFirst()];
            }
        }
        
        return maxElements;
    }
}
