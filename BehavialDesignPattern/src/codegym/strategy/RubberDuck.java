package codegym.strategy;

public class RubberDuck extends Duck {

    public RubberDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        super(quackBehavior, flyBehavior);
    }

    @Override
    public void display() {
        System.out.println("Look like a RubberDuck");
    }
}
