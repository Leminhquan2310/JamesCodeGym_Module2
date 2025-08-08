import java.util.Arrays;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Stack<Integer> stackInt = new Stack<>();
        int[] arrayInt = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        for (int item : arrayInt) {
            stackInt.push(item);
        }

        int i = 0;
        while (!stackInt.isEmpty()) {
            arrayInt[i] = stackInt.pop();
            i++;
        }

        for (int item : arrayInt) {
            System.out.println(item);
        }


        Stack<String> wStack = new Stack<>();
        String sentence = "Hello world this is Java";
        String[] words = sentence.split("\\s+");

        for (String mWord : words) {
            wStack.push(mWord);
        }

        System.out.println("Stack sau khi push: " + wStack);

        for (int j = 0; j < words.length; j++) {
            sentence += " " + wStack.pop();
        }

        System.out.println(sentence);

    }
}
