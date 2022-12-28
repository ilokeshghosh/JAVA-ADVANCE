package CollectionFrameWork.CollectionInterface.Set;


import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<Integer> Hset = new LinkedHashSet<>();
        Hset.add(54);
        Hset.add(90);
        Hset.add(100);
        Hset.add(23);
        Hset.add(230);

        System.out.println(Hset);

        Hset.remove(90);
        System.out.println(Hset);

        System.out.println(Hset.contains(100));

        System.out.println(Hset.isEmpty());

        System.out.println(Hset.size());

        Hset.clear();
        System.out.println(Hset);
        System.out.println(Hset.isEmpty());
    }
}
