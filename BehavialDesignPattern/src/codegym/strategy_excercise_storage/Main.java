package codegym.strategy_excercise_storage;

public class Main {
    public static void main(String[] args) {
        // Create user controller
        UserController userController = new UserController();

        // create user
        userController.add( new User(1, "Quan"));
        userController.setUserStorage(new XMLStorage());
        userController.store();

        userController.setUserStorage(new MySQLStorage());
        userController.store();
    }
}
