package facade_excercise;

public class Client {
    public static void main(String[] args) {
        RandomListFacade randomListFacade = new RandomListFacade();
        randomListFacade.printRandomEvenList(10, 50, 100);
    }
}
