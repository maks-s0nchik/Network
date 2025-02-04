import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloUser {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введіть ваше ім'я: ");
        String name = reader.readLine();

        System.out.print("Введіть ваш вік: ");
        int age = Integer.parseInt(reader.readLine());

        int birthYear = 2024 - age;  // Припускаємо, що поточний рік - 2024

        System.out.println("Привіт, " + name + "!");
        System.out.println("Ви народилися у " + birthYear + " році.");
    }
}
