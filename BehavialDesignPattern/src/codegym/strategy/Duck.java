package codegym.strategy;

public abstract class Duck {
    protected QuackBehavior quackBehavior;
    protected FlyBehavior flyBehavior;

    public Duck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        this.quackBehavior = quackBehavior;
        this.flyBehavior = flyBehavior;
    }


    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void quack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("I'm swimming");
    }

    public void fly() {
        flyBehavior.fly();
    }

    public abstract void display();
}
