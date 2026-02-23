// import java.util.Stack;

// class Solution {
//     public boolean isValid(String s) {
//         Stack<Character> stack = new Stack<>();

//         for (char c : s.toCharArray()) {
//             if (c == '(') stack.push(')');
//             else if (c == '{') stack.push('}');
//             else if (c == '[') stack.push(']');
//             else if (stack.isEmpty() || stack.pop() != c) return false;
//         }

//         return stack.isEmpty();
//     }
// }
import java.util.Stack;

class Solution {

    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // opening bracket
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }
            // closing bracket
            else {
                if (st.isEmpty()) return false;

                char top = st.peek();
                if (sameStyle(top, ch)) st.pop();
                else return false;
            }
        }
        return st.isEmpty();
    }

    boolean sameStyle(char a, char b) {
        if (a == '(' && b == ')') return true;
        if (a == '{' && b == '}') return true;
        if (a == '[' && b == ']') return true;
        return false;
    }
}

