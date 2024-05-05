import java.util.Queue;
import java.util.PriorityQueue;

public class CollectionQueue {
    public static void main(String[] args) {
        Queue<String> que = new PriorityQueue<String>();

        // Add to the Queue
        que.offer("roronoa_zoro");
        que.add("vinsmoke_sanji");
        que.add("nico_robin");
        // Remove from the Queue
        que.remove("vinsmoke_sanji");
        que.poll(); // removes the head

        // Peek the head, without removing
        System.out.println(que.peek());
        // Check if Queue is empty
        System.out.println(que.isEmpty());

        // seperator
        System.out.println("");
        // Iterate over Queue
        for (String element : que){
            System.out.println(element);
        }
    }    
}
