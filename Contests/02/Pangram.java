import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        // String dummyText = scanner.nextLine();
        String text = scanner.next();
        
        boolean isUnique = true;

        for (int i = 0; i < length - 1; i++) {
            char currentCharecter = text.charAt(i);
            for (int j = i + 1; j < length; j++) {
                if (currentCharecter == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (!isUnique) {
                break;
            }
        }
        
        if(isUnique){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        
        scanner.close();
    }
}
