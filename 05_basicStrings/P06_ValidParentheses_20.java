import java.util.ArrayDeque;
import java.util.Deque;

public class P06_ValidParentheses_20 {
    public static void main(String[] args) {
        String s = "([)]{}";

        int n = s.length();

        Deque<Character> stack = new ArrayDeque<>();

        stack.push(s.charAt(0));

        for (int i = 1; i < n; i++){
            char curr = s.charAt(i);
            
            if (stack.size() == 0){
                stack.push(curr);
                continue;
            }

            char top = stack.peek();

            if (top == '('){
                if (curr == ')'){
                    stack.pop();
                }
                else {
                    stack.push(curr);
                }
            }

            else if (top == '['){
                if (curr == ']'){
                    stack.pop();
                }
                else {
                    stack.push(curr);
                }

            }

            else if (top == '{'){
                if (curr == '}'){
                    stack.pop();
                }
                else {
                    stack.push(curr);
                }

            }
        }

        if (stack.size() == 0){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

    }
}
