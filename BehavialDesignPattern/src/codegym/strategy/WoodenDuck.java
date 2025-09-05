package codegym.strategy;

public class WoodenDuck extends Duck {
    public WoodenDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        super(quackBehavior, flyBehavior);
    }

    @Override
    public void display() {
        System.out.println("Look like a WoodenDuck");
    }
}
