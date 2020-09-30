package cf.mindaugas.app._11_queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(); // Creating empty priority queue
        pQueue.add(10); // Adding items to the pQueue using add()
        pQueue.add(20);
        pQueue.add(15);
        pQueue.add(13);
        System.out.println(pQueue);
        System.out.println(pQueue.peek()); // Printing the top element of the PriorityQueue
        System.out.println(pQueue.poll()); // Printing the top element and removing it from the PriorityQueue container
        System.out.println(pQueue); // Now it will be printed in sorted (natural) order
        System.out.println(pQueue.peek()); // Printing the top element of the PriorityQueue

        System.out.println(pQueue);
        System.out.println(pQueue.poll());
        System.out.println(pQueue.peek());
        System.out.println(pQueue.poll());
        System.out.println(pQueue.poll());
        System.out.println(pQueue);
    }
}
