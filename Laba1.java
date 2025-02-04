import java.util.Scanner;

public class Laba1 {
    public static void main(String[] args) {
         try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введіть своє ім'я: ");
            String name = scanner.nextLine();
            System.out.println("Привіт, " + name + "!");
            System.out.print("Скільки вам років? ");
            int age = scanner.nextInt();
            int currentYear = java.time.Year.now().getValue();
            int birthYear = currentYear - age;
            System.out.println("Ви народилися у " + birthYear + " році.");
        }
    }
}
