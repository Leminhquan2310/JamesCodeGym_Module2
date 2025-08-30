package validate_name_class;

import validate_account.AccountExample;

public class NameClassExampleTest {
    private static NameClassExample nameClassExample;

    public static final String[] validName = new String[]{"C0223G", "A0323K"};
    public static final String[] invalidName = new String[]{"M0318G", "P0323A"};

    public static void main(String[] args) {
          nameClassExample = new NameClassExample();
          for (String name : validName) {
              boolean isValid = nameClassExample.validate(name);
              System.out.println("Name is " + name + " is valid: " + isValid);
          }

        for (String name : invalidName) {
            boolean isValid = nameClassExample.validate(name);
            System.out.println("Name is " + name + " is valid: " + isValid);
        }

    }
}
