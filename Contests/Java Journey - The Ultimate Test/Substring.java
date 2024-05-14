import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Substring {

    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        String x = scan.nextLine(); // nullify enter key
        String text = scan.nextLine();

        for(int i = 0; i < length; i++){
            for(int j= i+1; j<= text.length(); j++){
                set.add(text.substring(i, j));
            }
        }

        System.out.println(set.size());
        scan.close();
    }
}