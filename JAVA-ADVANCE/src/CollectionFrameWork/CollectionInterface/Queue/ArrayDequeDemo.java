package CollectionFrameWork.CollectionInterface.Queue;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(44);
        adq.offer(29);
        adq.offer(61);
        adq.offer(98);


        adq.offerFirst(10);

        adq.offerLast(20);

        adq.offer(77);

        System.out.println(adq);


        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println();

        System.out.println("poll() : "+adq);
        System.out.println(adq.poll());

        System.out.println();

        System.out.println("pollFirst() : "+adq);
        System.out.println(adq.pollFirst());


        System.out.println("pollLast() : "+adq);
        System.out.println(adq.pollLast());
    }
}
