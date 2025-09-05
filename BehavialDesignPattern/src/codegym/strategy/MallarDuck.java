package codegym.strategy;

public class MallarDuck extends Duck{

    public MallarDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        super(quackBehavior, flyBehavior);
    }

    @Override
    public void display() {
        System.out.println("Look like a MallarDuck");
    }
}
