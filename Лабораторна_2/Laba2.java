import java.util.Scanner;

public class Laba2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.print("Введіть значення α : ");
            double alpha = scanner.nextDouble();

            double sinArg = 3 * Math.PI - 2 * alpha;
            double cosArg = 5 * Math.PI + 2 * alpha;
            double sinSquared = Math.pow(Math.sin(sinArg), 2);
            double cosSquared = Math.pow(Math.cos(cosArg), 2);
            double z1 = 2 * sinSquared * cosSquared;

            double sinArgZ2 = (5.0 / 2) * Math.PI - 8 * alpha;
            double z2 = (1.0 / 4) - (1.0 / 4) * Math.sin(sinArgZ2);

            System.out.println("z1 = " + z1);
            System.out.println("z2 = " + z2);
        }
    }
}