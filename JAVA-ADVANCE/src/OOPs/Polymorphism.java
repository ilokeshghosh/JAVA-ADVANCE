//Run Time polymorphism also called dynamic method dispatch
package OOPs;
class Animls{
    public void move(){
        System.out.println("Animals can move at different speed");
    }
}
class Dog extends Animls{
    public void move(){
        System.out.println("Dog can run Very fast ");
    }
}



//Compile time polymorphism (method over-loading)
class Students{
    String name;
    int age;

    public void printinfo(String name){
        System.out.println(name);
    }
    public void printinfo(int age){
        System.out.println(age);
    }
    public void printinfo(String name, int age){
        System.out.println(name+" "+age);
    }
}
public class Polymorphism {
    public static void main(String args[]){

        //Compile Time polymorphism
        Students s1=new Students();
        s1.name="Lokesh";
        s1.age=21;
        s1.printinfo(s1.name);
        s1.printinfo(s1.age);
        s1.printinfo(s1.name,s1.age);

        //Run time polymorphism
        Animls a1 = new Animls();
        a1.move();
        Dog d1 = new Dog();
        d1.move();



    }
}

