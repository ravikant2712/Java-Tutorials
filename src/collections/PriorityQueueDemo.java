package collections;

import java.util.Iterator;
import java.util.PriorityQueue;


// PriorityQueue in Java is a queue where elements are ordered based on their priority, rather than the order of insertion.
// By default, it uses natural ordering (min-heap), but a custom comparator can be used to define different priorities.
//Elements are processed based on priority rather than insertion order.
//Supports standard queue operations like add(), poll(), and peek().
//Automatically grows as elements are added.
//Uses a heap data structure internally to ensure efficient insertion and removal of the highest-priority element.
public class PriorityQueueDemo {

    static void main() {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(32);
        priorityQueue.add(4);
        priorityQueue.add(2);
        priorityQueue.add(25);
        priorityQueue.add(76);
        priorityQueue.add(83);

        System.out.println(priorityQueue);

        // Print the head of the queue
        System.out.println("Head of Queue: " + priorityQueue.peek());

        // using the method
        priorityQueue.remove(76);

        System.out.println("After Remove: " + priorityQueue);

        System.out.println("Poll Method: " + priorityQueue.poll());

        System.out.println("Final PriorityQueue: " + priorityQueue);


        for (Integer integer : priorityQueue) {
            System.out.print(integer + " ");
        }
    }

}

