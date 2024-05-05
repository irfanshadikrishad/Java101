import java.util.Stack;

public class CollectionStack {
    public static void main(String[] args) {
        Stack<String> stak = new Stack<String>();

        // Push item in Stack
        stak.push("vinsmoke_sanji");
        stak.push("roronoa_zoro");
        stak.push("nico_robin");
        // Pop removes last added item
        stak.pop();
        // Peek shows whats at the top of the Stack, without removing it
        System.out.println("at the top stack - " + stak.peek());
        // Check if stack is empty or not
        System.out.println("is stack empty? - " + stak.isEmpty());
        // Search the item, returns position
        System.out.println(stak.search("vinsmoke_sanji"));

        // Iteration
        System.out.println(""); // seperator
        for (String element : stak){
            System.out.println(element);
        }
    }    
}
