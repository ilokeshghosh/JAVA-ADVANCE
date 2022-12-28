package CollectionFrameWork.CollectionInterface.Set;

import CollectionFrameWork.Student;

import java.util.HashSet;
import java.util.Set;

public class set {
    public static void main(String[] args) {
        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student("Lokesh",4));
        studentSet.add(new Student("Rahul",44));
        studentSet.add(new Student("Anuj",404));

        studentSet.add(new Student("Rohit",404));

        System.out.println(studentSet);

    }
}
