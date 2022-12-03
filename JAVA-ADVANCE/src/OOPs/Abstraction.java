package OOPs;
abstract class Animal{
    abstract void walk();


    Animal(){
        System.out.println("You are creating a animal"); //this will also execute this method is called constructor chaining
    }
    public void eat(){
        System.out.println("Animal eats");
    }
}
class Horse extends Animal{

    Horse(){
        System.out.println("You are creating a horse");
    }

    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}
public class Abstraction {
    public static void main(String[] args){
        Horse horse=new Horse();
        horse.walk();
        horse.eat();

    }
}
