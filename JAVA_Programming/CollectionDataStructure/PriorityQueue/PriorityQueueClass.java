package PriorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueClass {
    public static void main(String[] args) {
        PriorityQueue priorityQueue=new PriorityQueue();
        priorityQueue.offer(100);
        priorityQueue.offer(200);
        priorityQueue.offer(500);
        priorityQueue.offer(400);
        priorityQueue.offer(900);
        priorityQueue.clear();
//        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());

        System.out.println(priorityQueue);
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);
    }
}
