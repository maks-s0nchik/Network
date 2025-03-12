import java.util.Scanner;

public class Laba2_2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
        
            System.out.print("Введіть значення a: ");
            double a = scanner.nextDouble();

            System.out.print("Введіть значення m: ");
            double m = scanner.nextDouble();

            System.out.print("Введіть значення x: ");
            double x = scanner.nextDouble();

            double g;
            if (a < m) {
                g = a * Math.pow(m, 2);
            } else {
                g = Math.pow(m, 3) + Math.exp(-a * m);
            }

            double y;
            if (x == g) {
                y = x;
            } else {
                y = 2 - (Math.pow(x, 2) / 9) * g;
            }

            System.out.println("g = " + g);
            System.out.println("y = " + y);
        
    }
    }
}