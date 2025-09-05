package codegym.strategy_excercise_storage;

public class MySQLStorage implements UserStorage {
    @Override
    public void store(User user) {
        System.out.println("Save user by MySQL: " + user);
    }
}
