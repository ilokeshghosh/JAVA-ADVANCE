package CollectionFrameWork.CollectionInterface.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args){
        //By default priority Queue work as Min Heap
       PriorityQueue<Integer> pq = new PriorityQueue<>();

       // After using Comparator.reverseOrder() method priority Queue will work as Max Heap
       PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(120);
        pq.offer(12);
        pq.offer(102);
        pq.offer(109);

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.peek());


    }
}
