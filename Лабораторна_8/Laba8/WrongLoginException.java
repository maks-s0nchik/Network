public class WrongLoginException extends Exception {
    public WrongLoginException() {
        super("Невірний формат логіну.");
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
