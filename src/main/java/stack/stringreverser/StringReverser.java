package stack.stringreverser;

import java.util.Stack;

public class StringReverser {
    public static void main(String[] args) {
        System.out.println(reverse("12345"));
    }

    public static String reverse(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }


        return sb.toString();
    }
}
