import java.util.Scanner;

public class PrimeNumber {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter quantity prime number print: ");
        int number = scanner.nextInt();
        int count = 0;
        int n = 2;
        while (count < number){
            if(isPrime(n)){
                System.out.println(n);
                count++;
            }
            n++;
        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
