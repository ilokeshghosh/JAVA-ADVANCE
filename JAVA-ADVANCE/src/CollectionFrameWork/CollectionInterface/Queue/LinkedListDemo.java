package CollectionFrameWork.CollectionInterface.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListDemo {
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(12);
        queue.offer(120);
        queue.offer(102);

        System.out.println(queue);

        System.out.println(queue.poll());

        System.out.println(queue);

        System.out.println(queue.peek());


    }
}
