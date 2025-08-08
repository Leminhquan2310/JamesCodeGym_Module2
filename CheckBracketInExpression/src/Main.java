import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String test = "s * (s – a) * (s – b) * (s – c)";
        String test2 = "(– b + (b2 – 4*a*c)^0.5) / 2*a";
        String test3 = "s * (s – a) * (s – b * (s – c)";
        if(isWell(test2)){
            System.out.println("Biểu thức hợp lệ");
        } else {
            System.out.println("Biểu thức không hợp lệ");
        }
    }

    public static boolean isWell (String expression) {
        Stack<String> stack = new Stack<>();
        for (String s : expression.split("")){
            if (s.equals("(")){
                stack.push(s);
            }

            if (s.equals(")")){
                if (stack.isEmpty()){
                    return false;
                } else {
                    String left = stack.pop();
                    switch (left){
                        case "(":
                            if (!s.equals(")")) return false;
                            break;
                        case "{":
                            if (!s.equals("}")) return false;
                            break;
                        case "[":
                            if (!s.equals("]")) return false;
                            break;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}