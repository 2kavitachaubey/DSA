package Arrays;

import java.util.Stack;

public class StackProblem {
    public static void main(String[] args) {
        String bracket = "{[]}";
        if(bracket.length() ==1){
            System.out.println(false);
        }
        Stack<Character> stack = new Stack<>();
        for(char ch : bracket.toCharArray()){
            if(ch == '[') stack.push(']');
            else if(ch == '(') stack.push(')');
            else if(ch == '{') stack.push('}');
            else {
                if(stack.isEmpty() || stack.pop() != ch){
                    System.out.println(false);
                }
            }
        }
        System.out.println(stack.isEmpty());
    }
}
