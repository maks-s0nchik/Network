public class Laba3_2 {
    public static void main(String[] args) {
        double a = 1.0, b = 2.0;
        double T = 2.0;
        double h_x = 0.2;
        
        System.out.println("Завдання 2: Обчислення y = cos^3(z + a) - x");
        for (double x = 0; x <= T; x += h_x) {
            double z = Math.pow(x, 3) + a * x + Math.pow(b, 3);
            double y = Math.pow(Math.cos(z + a), 3) - x;
            System.out.printf("x = %.2f, z = %.2f, y = %.2f%n", x, z, y);
            }
        }
}