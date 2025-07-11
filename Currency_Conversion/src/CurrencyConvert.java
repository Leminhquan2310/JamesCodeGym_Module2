import java.util.Scanner;

public class CurrencyConvert {
    public static void main(String[] args) {
        double rate = 25000;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter dollar: ");
        double dollar = scanner.nextDouble();

        double vnd = dollar * rate;
        System.out.printf("%.0f$ = %,.0fvnđ", dollar, vnd);
    }
}
