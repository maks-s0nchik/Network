import java.util.Scanner;

public class CredentialChecker {

    public static boolean checkCredentials(String login, String password, String confirmPassword) {
        try {
            // Перевірка логіну
            if (login == null || !login.matches("[a-zA-Z0-9_]+") || login.length() >= 20) {
                throw new WrongLoginException("Логін повинен містити лише латинські літери, цифри або підкреслення і бути менше 20 символів.");
            }

            // Перевірка паролю
            if (password == null || !password.matches("[a-zA-Z0-9_]+") || password.length() >= 20) {
                throw new WrongPasswordException("Пароль повинен містити лише латинські літери, цифри або підкреслення і бути менше 20 символів.");
            }

            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Паролі не збігаються.");
            }

            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Помилка: " + e.getMessage());
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть логін: ");
        String login = scanner.nextLine();

        System.out.print("Введіть пароль: ");
        String password = scanner.nextLine();

        System.out.print("Підтвердіть пароль: ");
        String confirmPassword = scanner.nextLine();

        boolean result = checkCredentials(login, password, confirmPassword);
        System.out.println("Результат перевірки: " + result);
    }
}
