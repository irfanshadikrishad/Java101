import java.util.Scanner;

public class GBCwA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfItems = scanner.nextInt();
        int[] array = new int[numberOfItems];

        for (int i = 0; i < numberOfItems; i++) {
            int cost = scanner.nextInt();
            array[i] = cost;
        }
        
        int totalPrice = 0;
        for (int cos : array) {
            totalPrice += cos;
        }

        System.out.println("Total grocery bill: " + totalPrice);
        
        scanner.close();
    }
}
