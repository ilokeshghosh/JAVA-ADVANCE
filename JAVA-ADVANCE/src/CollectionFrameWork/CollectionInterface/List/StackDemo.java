package CollectionFrameWork.CollectionInterface.List;
import java.lang.*;
import java.util.*;
public class StackDemo {
    public static void main(String[] args){

        //Stack follows LIFO(Last In First Out) Methods
        Stack<String> animal = new Stack<>();
        animal.push("Lion");
        animal.push("Dog");
        animal.push("Horse");
        animal.push("Cat");

        System.out.println("Stack "+animal);
        System.out.println("Stack peek : "+animal.peek());
        animal.pop();
        System.out.println("Stack "+animal);
        System.out.println("Stack peek : "+animal.peek());

    }
}
