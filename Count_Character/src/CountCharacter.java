import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = "Hello world!";
        System.out.print("Enter a character: ");
        String character = scanner.nextLine();
        int count = 0;

        for (int i = 0; i < string.length(); i++) {
            if(String.valueOf(string.charAt(i)).equals(character)){
                count++;
            }
        }

        System.out.println("Count: " + count);
    }
}
