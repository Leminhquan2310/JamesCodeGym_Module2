package codegym.strategy_excercise_storage;

public class XMLStorage implements UserStorage{
    @Override
    public void store(User user) {
        System.out.println("Save user by XML: " + user);
    }
}
