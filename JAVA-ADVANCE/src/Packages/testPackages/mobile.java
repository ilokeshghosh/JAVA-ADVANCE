package Packages.testPackages;
import java.lang.*;
public class mobile extends living_being{
    public int wheel;
    public String color;
    public int speed;

    public void  move(){
        System.out.println("I move  with "+this.wheel+" wheels and my speed is "+this.speed+"km/h");

    }
    public void see(){
        System.out.println("You can spot me by my "+this.color+" color");
    }

}
