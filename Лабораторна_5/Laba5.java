import java.util.Random;

public class Laba5 {
    public static void main(String[] args) {
        int[][] N = new int[4][5];
        int[] products = new int[5];
        Random rand = new Random();

        for (int j = 0; j < 5; j++) {
            products[j] = 1;
            boolean hasValid = false;
            for (int i = 0; i < 4; i++) {
                if (N[i][j] >= 10 && N[i][j] < 55) {
                    products[j] *= N[i][j];
                    hasValid = true;
                }
            }
            if (!hasValid) products[j] = 0;
        }
        
        System.out.println("Двовимірний масив N:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                N[i][j] = rand.nextInt(100);
                System.out.print(N[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Добутки значень елементів кожного стовпця (де елементи у [10;55)):");
        for (int product : products) {
            System.out.print(product + "\t");
        }
    }
}
