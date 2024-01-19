public class ifelse {
    public static void main(String[] args) {
        int number = 30;

        if (number > 5) {
            System.out.println( "1. " + number);
        }else if (number < 5){
            System.out.println( "2. " + number);
        } else {
            System.out.println("3. " + number);
        }
        
        // Short hand if else
        System.out.println((number > 12) ? "Good Morning" : "Good Night");
    }
}
