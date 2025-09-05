package codegym.strategy;

public class Client {
    public static void main(String[] args) {
        Duck mala = new MallarDuck(new MuteQuack(), new FlyWithWings());
        mala.fly();
        mala.swim();
        mala.quack();
        mala.display();
    }
}
