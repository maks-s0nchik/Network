import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Laba1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Як вас звати? ");
        String name = reader.readLine();
        System.out.println("Привіт, " + name + "!");
        int now = 2025;
        System.out.print("Скільки вам років? ");
        int age = Integer.parseInt(reader.readLine());
        System.out.println("Ви народилися у " + (now - age) + " році.");
    }
}
