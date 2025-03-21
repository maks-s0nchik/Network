public class Laba4_2 {
    public static void main(String[] args) {
        int[] A = {3, 0, 0, 4, 5, 0, 0, 0, 8, 9, 0, 0, 2, 0, 0, 7, 0};

        System.out.print("Початковий масив: ");
        for (int num : A) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] B = new int[A.length];
        int index = 0;
        boolean lastWasZero = false;

        for (int num : A) {
            if (num != 0) {
                B[index++] = num;
                lastWasZero = false;
            } else if (!lastWasZero) {
                B[index++] = num;
                lastWasZero = true;
            }
        }

        System.out.print("Оновлений масив: ");
        for (int i = 0; i < index; i++) {
            System.out.print(B[i] + " ");
        }
    }
}
