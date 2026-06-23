import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> operandStack = new Stack<>();
        
        for (String token : tokens) {
            switch (token) {
                case "+":
                    operandStack.push(operandStack.pop() + operandStack.pop());
                    break;
                case "-":
                    int rightSub = operandStack.pop();
                    int leftSub = operandStack.pop();
                    operandStack.push(leftSub - rightSub);
                    break;
                case "*":
                    operandStack.push(operandStack.pop() * operandStack.pop());
                    break;
                case "/":
                    int rightDiv = operandStack.pop();
                    int leftDiv = operandStack.pop();
                    operandStack.push(leftDiv / rightDiv);
                    break;
                default:
                    operandStack.push(Integer.parseInt(token));
                    break;
            }
        }
        
        return operandStack.pop();
    }
}
