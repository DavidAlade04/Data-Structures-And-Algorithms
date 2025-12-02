package DataStructures;
import java.util.Queue;
import java.util.LinkedList;
public class Queues {

    public static void main(String[] args) {

        Queue <Integer> queue = new LinkedList<>();

        queue.add(123);
        queue.add(234);
        queue.add(345);

        System.out.println(queue.poll());

        System.out.println(queue);
    }
}
