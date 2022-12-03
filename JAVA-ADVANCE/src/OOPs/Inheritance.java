package OOPs;
import java.util.*;
//import bank.*;
class Shape{
    String color;
    public void area(){
        System.out.print("Display Area");

    }


}

class Triangle extends Shape{ //single level inheritance
    public void area(int l, int h){
        System.out.println(1/2*l*h);

    }
}

class Circle extends Shape{ //Hierarchial Inheritance
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}
class EquilateralTriangle extends Triangle{ //multilevel inheritance
    public void area(int l, int h){

    }

}

public class Inheritance{
    public static void main(String[] args){
//        Triangle t1=new Triangle();
//        t1.area();
//        t1.area(5,3);
//        bank.Account account1=new bank.Account();
//        account1.name="customer1";



    }
}
