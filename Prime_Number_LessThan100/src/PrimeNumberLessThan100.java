public class PrimeNumberLessThan100 {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            if (isPrime(i)) System.out.println(i);
        }
    }

    public static boolean isPrime (int number){
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0) return false;
        }
        return true;
    }

}
