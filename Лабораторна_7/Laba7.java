public class Laba7 {
    private String title;
    private String content;

    // Конструктор без параметрів
    public Laba7() {
        this.title = "Без назви";
        this.content = "";
    }

    // Конструктор з параметрами
    public Laba7(String title, String content) {
        this.title = title;
        this.content = content;
    }

    // Виведення заголовку записки
    public void printTitle() {
        System.out.println("Заголовок: " + title);
    }

    // Виведення тексту записки
    public void printContent() {
        System.out.println("Текст записки: " + content);
    }

    // Виведення кількості символів у записці
    public void printCharCount() {
        int totalLength = title.length() + content.length();
        System.out.println("Кількість символів у записці (заголовок + текст): " + totalLength);
    }

    // Основний метод для перевірки
    public static void main(String[] args) {
        Laba7 note1 = new Laba7("Нагадування", "Не забути купити продуктів.");
        note1.printTitle();
        note1.printContent();
        note1.printCharCount();
    }
}

