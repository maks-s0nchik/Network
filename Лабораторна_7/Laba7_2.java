public class Laba7_2 {
    public static void main(String[] args) {

        // Імена, тема та текст 
        String[] people = {"Альона", "Ігор", "Марія"};
        String title = "Зустріч";
        String content = "Нагадую про зустріч. У середу о 14:00.";

        // Кількість унікальних пар без повторів (комбінації)
        int totalPairs = people.length * (people.length - 1) / 2;
        Letter[] letters = new Letter[totalPairs];

        int index = 0;
        for (int i = 0; i < people.length; i++) {
            for (int j = i + 1; j < people.length; j++) {
                letters[index++] = new Letter(title, content, people[i], people[j]);
            }
        }

        System.out.println("Тема записки: " + title);
        System.out.println("Зміст записки: " + content);
        System.out.println("Кількість символів у заголовку: " + title.length());

        System.out.println("\nПари ВІДПРАВНИК – ОДЕРЖУВАЧ (без повторень):");
        for (Letter letter : letters) {
            letter.printSenderReceiver();
        }
    }
}

// Батьківський клас
class Origin {
    protected String title;

    public Origin() {
        this.title = "Без теми";
    }

    public Origin(String title) {
        this.title = title;
    }

    public void printTitle() {
        System.out.println("Заголовок: " + title);
    }

    public void printCharCount() {
        System.out.println("Кількість символів у заголовку: " + title.length());
    }
}

// Дочірній клас Letter
class Letter extends Origin {
    private String content;
    private String sender;
    private String receiver;

    public Letter(String title, String content, String sender, String receiver) {
        super(title);
        this.content = content;
        this.sender = sender;
        this.receiver = receiver;
    }

    public void printTheme() {
        System.out.println("Тема листа: " + title);
    }

    public void printContent() {
        System.out.println("Текст листа: " + content);
    }

    public void printSenderReceiver() {
        System.out.println("Відправник: " + sender + ", Одержувач: " + receiver);
    }
}
