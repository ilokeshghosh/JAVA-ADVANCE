package CollectionFrameWork.CollectionInterface.Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer>  set = new TreeSet<>();

        set.add(54);
        set.add(90);
        set.add(100);
        set.add(23);
        set.add(230);

        System.out.println(set);

        set.remove(90);
        System.out.println(set);

        System.out.println(set.contains(100));

        System.out.println(set.isEmpty());

        System.out.println(set.size());

        set.clear();
        System.out.println(set);
        System.out.println(set.isEmpty());
    }
}
