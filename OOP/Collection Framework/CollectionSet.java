import java.util.Set;
import java.util.TreeSet;

public class CollectionSet {
    public static void main(String[] args) {
        Set<String> sett = new TreeSet<String>();
        Set<String> other_sett = new TreeSet<String>();

        // Adding Values
        sett.add("roronoa_zoro");
        sett.add("vinsmoke_sanji");
        sett.add("nico_robin");
        sett.add("nami");
        sett.add("jimbe");
        // Adding Values
        other_sett.add("vinsmoke_sanji");
        other_sett.add("jimbe");
        other_sett.add("chopper");

        // Remove values
        sett.remove("nami");

        // Check Exist or not
        System.out.println(sett.contains("nico_robin")); // returns boolean
        System.out.println("");

        // Union
        // sett.addAll(other_sett);

        // Intersection
        // sett.retainAll(other_sett);

        // Difference
        sett.removeAll(other_sett);
        
        // Iterate over Set
        for (String elem : sett){
            System.out.println(elem);
        }
        System.out.println("");
        // Other Set
        // for (String elem : other_sett){
        //     System.out.println(elem);
        // }
    }
}
