public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super("Невірний формат пароля.");
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
