import java.util.Arrays;
import java.util.Random;

public class Laba4 {
    public static void main(String[] args) {
        int[] A = new int[12];
        Random rand = new Random();

        for (int i = 0; i < A.length; i++) {
            A[i] = rand.nextInt(101) - 50;
        }

        System.out.println("Масив: " + Arrays.toString(A));

        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int num : A) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }

            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        System.out.println("Два найбільші значення: " + max1 + ", " + max2);
        System.out.println("Два найменші значення: " + min1 + ", " + min2);
    }
}
