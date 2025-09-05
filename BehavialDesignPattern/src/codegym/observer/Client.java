package codegym.observer;

public class Client {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer observer1 = new Observer() {
            public void update(String message) {
                System.out.println("Message 1 changed: " + message);
            }
        };
        subject.attach(observer1);
        Observer observer2 = new Observer() {
            public void update(String message) {
                System.out.println("Message 2 changed: " + message);
            }
        };
        subject.attach(observer2);
        subject.notifyChange("Test change state 1");
        subject.detach(observer1);
        subject.notifyChange("Test change state 2");
    }
}
