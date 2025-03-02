public class Laba3 {
    public static void main(String[] args) {
        double a = 1.0, b = 2.0;
        double h_x = 0.5, by = 1.5;

        System.out.println("Завдання 1: Обчислення z = (ax) / (by)");
        for (double x = a; x <= b; x += h_x) {
            double z = (a * x) / (by);
            System.out.printf("x = %.2f, z = %.2f%n", x, z);
        }
    }
}
