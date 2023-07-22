import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Shekhar {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("shekhar.dat"));
        int TC = in.nextInt();
        in.nextLine();

        for (int i = 0; i < TC; i++) {
            String og = in.nextLine();
            String line = og.replaceAll("[\\d\\w-+*/.\\s]+", "");
            String open = "({[", close = ")}]";

            Stack<Character> stack = new Stack<>();

            boolean exitCase = false;
            for (char c: line.toCharArray()) {
                if (open.contains(""+c)) {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) {
                        exitCase = true;
                        break;
                    }

                    if (stack.peek().equals(open.charAt(close.indexOf(c))))
                        stack.pop();
                }
            }

            if (!stack.isEmpty() || exitCase)
                System.out.println(og + " is nested incorrectly");
            else
                System.out.println(og + " is nested correctly");
        }
    }
}
