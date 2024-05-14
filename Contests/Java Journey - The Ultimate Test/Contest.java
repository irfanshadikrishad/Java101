import java.util.Scanner;
import java.util.LinkedList;

public class Contest {
        public static void main(String[] args) {
            LinkedList<String> list = new LinkedList<String>();
            Scanner scan = new Scanner(System.in);
            int length = scan.nextInt();

            String x = scan.nextLine(); // nullify next line
            
            for (int i = 0; i < length; i++){
                String name = scan.nextLine();
                
                if(name.startsWith("1_")){
                    list.add(name);
                }
                
            }

            // traversing the list
            for(String element : list){
                System.out.println(element);
            }

            // closing the scanner
            scan.close();
        }
}