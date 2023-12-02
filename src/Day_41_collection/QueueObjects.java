package Day_41_collection;

import java.util.PriorityQueue;

public class QueueObjects {
    public static void main(String[] args) {

        PriorityQueue <Integer> queue = new PriorityQueue<>();

        queue.add(2);
        queue.add(10);
        queue.add(8);
        queue.add(1);
        queue.add(1);
        //queue.get(); get method is from list
        System.out.println(queue); // [1, 1, 8, 10, 2]

        queue.offer(30); // same as add method
        System.out.println(queue); // [1, 1, 8, 10, 2, 30]

        //System.out.println(new PriorityQueue<>().remove());  causes exception because there is no elements
        System.out.println(new PriorityQueue<>().poll());//  return null
    }
}
