package arrayList;

import java.util.Stack;

public class Stack_one {
    public static void main(String[] args) {

        System.out.println("{}{}{}} ----> " + areParenthesisBalanced("{}{}{}}"));
        System.out.println("}{}{}{} ----> " + areParenthesisBalanced("}{}{}{}"));
        System.out.println("{{}}{{}} ----> " + areParenthesisBalanced("{{}}{{}}"));
        System.out.println("{}}}}}} ----> " + areParenthesisBalanced("{}}}}}}"));
        System.out.println("{}{}{{}} ----> " + areParenthesisBalanced("{}{}{{}}"));
    }

    public static boolean areParenthesisBalanced(String str) {

        Stack<Character> stack = new Stack<>();

        for (char character : str.toCharArray()) {
            if (character == '{') {
                stack.push(character);
            } else if (character == '}') {
                if (stack.isEmpty()) {
                    return false;

                }
                stack.pop();

            }

        }
        return stack.isEmpty();
    }
}
