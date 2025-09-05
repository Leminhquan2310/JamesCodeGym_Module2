package codegym.strategy_excercise_storage;

public class UserController {
    private UserStorage userStorage;
    private User user;

    public void setUserStorage(UserStorage userStorage) {
        this.userStorage = userStorage;
    }

    public void add(User user) {
        this.user = user;
    }

    public void store() {
        userStorage.store(user);
    }
}
