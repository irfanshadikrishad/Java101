import java.util.Scanner;

public class CheckUniqueYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        boolean isUnique = true; // Initialize isUnique to true
        if (year >= 1000 && year <= 3000) {
            String yearStr = String.valueOf(year);
            for (int i = 0; i < yearStr.length(); i++) {
                char c = yearStr.charAt(i);
                for (int j = i + 1; j < yearStr.length(); j++) {
                    if (c == yearStr.charAt(j)) {
                        // If a duplicate digit is found, set isUnique to false and break out of the loop
                        isUnique = false;
                        break;
                    }
                }
                if (!isUnique) {
                    break; // If a duplicate is found, no need to continue checking
                }
            }
            if(isUnique){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        } else {
            System.out.println("Out of range - year");
        }
        scanner.close();
    }
}
