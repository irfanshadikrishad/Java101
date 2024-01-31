import java.util.Scanner;

public class MultiplicationSeries {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int n = number.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
        
        number.close();
    }
}
