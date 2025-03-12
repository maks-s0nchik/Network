import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Laba1_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть відстань S1 (км):");
        float S1 = Float.parseFloat(reader.readLine());
        System.out.println("Введіть час t1 (год):");
        float t1 = Float.parseFloat(reader.readLine());
        System.out.println("Введіть відстань S2 (км):");
        float S2 = Float.parseFloat(reader.readLine());
        System.out.println("Введіть час t2 (год):");
        float t2 = Float.parseFloat(reader.readLine());
        float totalTime = t1 + t2;
        float totalDistance = S1 + S2;
        float averageSpeed = totalDistance / totalTime;

        System.out.println("Загальний час руху: " + totalTime + " год");
        System.out.println("Середня швидкість: " + averageSpeed + " км/год");
    }
}
