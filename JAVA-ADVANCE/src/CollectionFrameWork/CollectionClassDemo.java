package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionClassDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(32);
        list.add(320);
        list.add(3002);
        list.add(322);
        list.add(32);
        list.add(322);
        list.add(392);

        //Finding max and min
        System.out.println("Min Element : "+ Collections.min(list));
        System.out.println("Max Element : "+ Collections.max(list));


        //Finding frequency of an element in Array
        System.out.println("Number of times 9 is present in array : "+Collections.frequency(list, 32));

        //Sorting  a Array
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);



        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("Lokesh",2));
        list1.add(new Student("Ramesh",1));
        list1.add(new Student("Ram",3));

        Student s1 = new Student("Anuj",6);
        Student s2 = new Student("Rohit",7);





        System.out.println(s1.compareTo(s2));


        //This sort method implements compare to inside it to sort the array
        System.out.println("Before Sorting :");
        System.out.println(list1);
        System.out.println("After Sorting :");
        Collections.sort(list1);
        System.out.println(list1);

        //Comparable is used to compare of specific data types , it is not dynamic
        //For comparing dynamically we use Comperator

        Collections.sort(list1, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        System.out.println(list1);
    }
}
