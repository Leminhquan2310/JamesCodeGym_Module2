import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int decimalNumber = 30;
        while (decimalNumber != 0){
            int item = decimalNumber % 2;
            decimalNumber = decimalNumber / 2;
            stack.push(item);
        }

        System.out.printf("Số nhị phân của 30 là: ", decimalNumber);
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}