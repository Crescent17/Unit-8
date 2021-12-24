import java.util.Scanner;

public class MinimumElement {

    static Scanner scanner = new Scanner(System.in);

    private static int readInteger() {

        while (true) {
            System.out.println("Enter size ");
            boolean isAnInt = scanner.hasNextInt();
            int size = 0;
            if (isAnInt) {
                size = scanner.nextInt();
            } else {
                System.out.println("Invalid number");
                scanner.nextLine();
                continue;
            }
            return size;
        }
    }

    private static int[] readElements(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + i + " element: ");
            while (true) {
                boolean isAnInt = scanner.hasNextInt();
                if (isAnInt) {
                    array[i] = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Invalid number");
                    scanner.nextLine();
                }
            }
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
