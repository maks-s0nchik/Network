import java.util.Scanner;

public class Laba6_2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Lead a line:");
            String input = scanner.nextLine();

            String replacedText = input.replaceAll("cat", "dog");

            System.out.println("The result:");
            System.out.println(replacedText);
        }
    }
}

