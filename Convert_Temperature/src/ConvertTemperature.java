import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius, fahrenheit;
        int choice;

        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Enter fahrenheit: ");
                    fahrenheit = scanner.nextDouble();
                    System.out.println("Celsius: " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.print("Enter celsius: ");
                    celsius = scanner.nextDouble();
                    System.out.println("Fahrenheit: " + celsiusToFahrenheit(celsius));
                    break;
                case 0: System.exit(0);
            }
        } while (true);

    }

    public static double celsiusToFahrenheit (double celsius){
        return (9.0 / 5) * celsius + 32;
    }

    public static double fahrenheitToCelsius (double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }
}
