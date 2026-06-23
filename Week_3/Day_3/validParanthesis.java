import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> charStack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            
            // If it's an opening bracket, push to stack
            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                charStack.push(currentChar);
            } else {
                // If it's a closing bracket and stack is empty, it's invalid
                if (charStack.isEmpty()) {
                    return false;
                }
                
                char topChar = charStack.peek();
                if ((currentChar == ')' && topChar == '(') ||
                    (currentChar == '}' && topChar == '{') ||
                    (currentChar == ']' && topChar == '[')) {
                    charStack.pop();
                } else {
                    return false; // Mismatched brackets
                }
            }
        }
        
        return charStack.isEmpty();
    }
}
