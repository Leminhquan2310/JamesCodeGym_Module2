package codegym.strategy;

public class RedHeadDuck extends Duck {
    public RedHeadDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        super(quackBehavior, flyBehavior);
    }

    @Override
    public void display() {
        System.out.println("Look like a RedHeadDuck");
    }
}
