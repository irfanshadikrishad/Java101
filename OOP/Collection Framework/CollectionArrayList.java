import java.util.ArrayList;

public class CollectionArrayList {
    public static void main(String[] args) {

        ArrayList<String> lis = new ArrayList<String>();
        
        // Add Items to the list
        lis.add("zeitu");
        lis.add("irfan");
        lis.add("zoro");
        lis.add("sanji");
        lis.add("nico");

        // Remove Items from the list
        lis.remove(0);  // by index
        lis.remove("zoro"); // by string

        // Changing Values by string
        lis.set(0, "irfanshadikrishad");
        lis.set(1, "vinsmoke_sanji");
        lis.set(2, "nico_robin");

        // size
        System.out.println(lis.size());

        // Printing by for loop
        for(String elem : lis){
            System.out.println(elem);
        }
    }
}