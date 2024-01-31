import java.util.Scanner;

public class RDT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int case_number = scanner.nextInt();
        int[] calculations = new int[case_number];
        for (int i = 0; i < case_number; i++) {
            int amount = scanner.nextInt();
            int calc = amount / 250;
            calculations[i] = calc;
        }
        
        for(int price : calculations){
            System.out.println(price);
        }
        
        scanner.close();
    }
}
