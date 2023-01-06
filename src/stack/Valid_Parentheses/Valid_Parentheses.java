package stack.Valid_Parentheses;

import java.util.Stack;

public class Valid_Parentheses {
    public static void main(String[] args){
        String s = "()[]{}";
        Solution solution = new Solution();
        System.out.println(solution.isValid(s));
    }
}

class Solution{
    public boolean isValid(String s) {
        if(s == null || s.length() ==0) return true;
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(')');
            }else if(s.charAt(i) == '{'){
                stack.push('}');
            }else if(s.charAt(i) == '['){
                stack.push(']');
            }else{
                if(stack.isEmpty() || stack.pop() != s.charAt(i)) return false;
            }
        }
        return stack.isEmpty();
    }
}