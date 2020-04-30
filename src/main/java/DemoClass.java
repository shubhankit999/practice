import java.util.Scanner;
import java.util.Stack;

public class DemoClass {

    public static void main(String[] args) {
        String s = "1 3 2 5 4";
        String[] chars = s.split(" ");
        int h = Integer.parseInt(chars[0]);
        int count = 1;
        for(int i=1; i<chars.length; i++) {
            int c = Integer.parseInt(chars[i]);
            if(h < c) {
                h = c;
            } else {
                count++;
            }
        }

        System.out.println(count);

    }


    public static int sss(char[] chars) {

        if(chars.length ==1) {
            return 1;
        }
        if(allCharEquals(chars)) {
            return chars.length;
        }
        Stack<Character> stack = new Stack();


        for(char c : chars) {
            if(stack.empty() || (stack.peek() == c) ) {
                stack.push(c);
            } else {
                if ((stack.peek() == 'a' && c == 'b') || (stack.peek() == 'b' && c == 'a')) {
                    stack.pop();
                    stack.push('c');
                }

                else if ((stack.peek() == 'c' && c == 'b') || (stack.peek() == 'b' && c == 'c')) {

                    stack.pop();
                    stack.push('a');

                }

                else if ((stack.peek() == 'c' && c == 'a') || (stack.peek() == 'a' && c == 'c')) {
                    stack.pop();
                    stack.push('b');
                }
            }

        }

        char[] chars1 = new char[stack.size()];
        int i =0;
        for(Character c : stack) {
            chars1[i++] = c;
        }

        return sss(chars1);

    }


    public static boolean allCharEquals(char[] chars) {
        char f = chars[0];
        for(int i=1; i<chars.length; i++) {
            if(f!=chars[i]) {
                return false;
            }
        }

        return true;
    }
}
