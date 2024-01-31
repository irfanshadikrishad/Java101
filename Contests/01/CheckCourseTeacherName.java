import java.util.Scanner;

public class CheckCourseTeacherName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String section = input.nextLine();

        if (section.equals("A") || section.equals("B") || section.equals("E")){
            System.out.println("JIM Sir");
        } else {
            System.out.println("JAC Sir");
        }
        input.close();
    }
}
