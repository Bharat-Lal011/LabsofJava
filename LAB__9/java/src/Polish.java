import java.util.Stack;

class ConvertThread extends Thread {
    String postfix;

    ConvertThread(String postfix) {
        this.postfix = postfix;
    }

    public void run() {
        Stack<String> stack = new Stack<>();

        for (char ch : postfix.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                stack.push(ch + "");
            } else {
                String b = stack.pop();
                String a = stack.pop();
                String exp = "(" + a + ch + b + ")";
                stack.push(exp);
            }
        }

        System.out.println("Infix Expression: " + stack.pop());
    }
}

public class Polish {
    public static void main(String[] args) {
        String postfix = "AB*CD/+";

        ConvertThread t = new ConvertThread(postfix);
        t.start();
    }
}
