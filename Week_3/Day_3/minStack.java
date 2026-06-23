import java.util.Stack;

class MinStack {
    private Stack<Integer> mainStack;
    private Stack<Integer> trackMinStack;

    public MinStack() {
        mainStack = new Stack<>();
        trackMinStack = new Stack<>();
    }

    public void push(int val) {
        mainStack.push(val);
        if (trackMinStack.isEmpty()) {
            trackMinStack.push(val);
        } else {
            int currentMin = trackMinStack.peek();
            if (val < currentMin) {
                trackMinStack.push(val);
            } else {
                trackMinStack.push(currentMin);
            }
        }
    }

    public void pop() {
        if (!mainStack.isEmpty()) {
            mainStack.pop();
            trackMinStack.pop();
        }
    }

    public int top() {
        return mainStack.peek();
    }

    public int getMin() {
        return trackMinStack.peek();
    }
}
