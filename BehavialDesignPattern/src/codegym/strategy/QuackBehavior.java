package codegym.strategy;

interface QuackBehavior {
    void quack();
}

class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack quack...");
    }
}

class Queck implements QuackBehavior {
    public void quack() {
        System.out.println("Queck queck...");
    }
}

class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("...");
    }
}