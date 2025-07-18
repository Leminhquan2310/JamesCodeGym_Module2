//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        System.out.println("Fan 1 -> toString()");
        System.out.println(fan1.toString());

        System.out.println("Fan 2 -> toString()");
        System.out.println(fan2.toString());

        fan1.setSpeed(fan1.getFAST());
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn(true);

        fan2.setSpeed(fan2.getMEDIUM());
        fan2.setRadius(5);
        fan2.setColor("Blue");

        System.out.println("Fan 1 -> toString()");
        System.out.println(fan1.toString());

        System.out.println("Fan 2 -> toString()");
        System.out.println(fan2.toString());
    }
}