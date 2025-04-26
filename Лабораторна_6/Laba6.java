import java.util.Scanner;

public class Laba6 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Lead a line:");
            String input = scanner.nextLine();

            String cleaned = input.toLowerCase().replaceAll("[^a-zа-яіїєґ0-9]", "");

            String reversed = new StringBuilder(cleaned).reverse().toString();

            if (cleaned.equals(reversed)) {
                 System.out.println("Palindrom.");
            } else {
                System.out.println("No palindrom.");
            }
        }
    }
}