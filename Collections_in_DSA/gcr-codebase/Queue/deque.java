import java.util.*;

public class deque {

    public static void main(String[] args) {

        Deque<Integer> printQueue = new ArrayDeque<>();

        // Normal Jobs
        printQueue.addLast(101);
        printQueue.addLast(102);
        printQueue.addLast(103);

        // Urgent Job
        printQueue.addFirst(999);

        System.out.println("Printing Order:");

        while (!printQueue.isEmpty()) {
            System.out.println("Printing Job: " + printQueue.removeFirst());
        }
    }
}