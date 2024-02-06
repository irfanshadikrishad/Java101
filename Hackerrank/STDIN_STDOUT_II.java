package Hackerrank;

import java.util.Scanner;

public class STDIN_STDOUT_II {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine(); // to ignore 'enter' key leftover
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        
        scan.close();
    }
}
