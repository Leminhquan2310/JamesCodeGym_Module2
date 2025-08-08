import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String palindrome = "Able was I ere I saw Elba";
        Stack<String> myStack = new Stack<>();
        Queue<String> myQueue = new LinkedList<>();

        for (String s : palindrome.toLowerCase().split("")) {
            myStack.push(s);
            myQueue.add(s);
        }

        boolean isPalindrome = true;
        for (int i = 0; i < palindrome.length(); i++) {
            String item1 = myStack.pop();
            String item2 = myQueue.poll();
            if (!item1.equals(item2)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome ? "Là chuỗi palindrome" : "Không phải là chuỗi palindrome!");
    }
}