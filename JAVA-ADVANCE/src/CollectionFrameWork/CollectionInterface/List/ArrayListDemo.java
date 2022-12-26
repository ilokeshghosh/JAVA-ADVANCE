package CollectionFrameWork.CollectionInterface.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList<String> student = new ArrayList<>();
        student.add("Lokesh Ghosh");
        student.add("Ram Ghosh");
        student.add(1,"Rakesh Roy");
        System.out.println(student);
        System.out.println(student.get(1));
        student.remove(1);
        System.out.println(student);


        List<Integer> num = new ArrayList<>();
        num.add(6);
        num.add(8);
        System.out.println(num);
        num.remove(Integer.valueOf(6));
        System.out.println(num);


        List<Integer> newList = new ArrayList<>();
        newList.add(56);
        newList.add(33);
        num.addAll(newList);
        System.out.println(num);

        num.set(1,1001);
        System.out.println(num);
        System.out.println(num.contains(33));

    }
}
