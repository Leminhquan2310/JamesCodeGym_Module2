package codegym.strategy;

interface FlyBehavior {
    public void fly();
}

class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("Fly fly..");
    }
}

class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("???");
    }
}
