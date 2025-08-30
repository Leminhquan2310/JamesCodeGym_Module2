package validate_phone_number;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberTest {
    private final static String validPhone = "(84)-(0978489648)";
    private final static String[] invalidPhone = new String[]{"(84)-(9978489648)", "(a8)-(22222222)", "(84)-(22b22222)"};

    public static void main(String[] args) {
        boolean isValid = validate(validPhone);
        System.out.println("Phone number is " + validPhone + " is valid: " + isValid);

        for (String phone : invalidPhone) {
            boolean isValids = validate(phone);
            System.out.println("Phone number is " + phone + " is valid: " + isValids);
        }
    }

    public static boolean validate(String regex) {
        Pattern pattern = Pattern.compile("^\\(\\d{2}\\)-\\(0\\d{9}\\)$");
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
