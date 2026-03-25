import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Front: " + queue.peek());

        queue.poll();

        System.out.println("After removal: " + queue);
    }
}
