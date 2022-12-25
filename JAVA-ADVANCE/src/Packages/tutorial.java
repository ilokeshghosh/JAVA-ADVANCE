package Packages;

import Packages.testPackages.living_being;
import Packages.testPackages.immotile;
import Packages.testPackages.mobile;


class animal extends living_being {
    public int hand;
    public void touch(){
        System.out.println("I can touch because i have "+this.hand+" hands");
    }

}

class object extends immotile{

    public String usage;
    public void use(){
        System.out.println("I am used as/in : \" " +this.usage+" \" ");
    }

}
public class tutorial {
    public static void main(String[] args){
        animal human = new animal();
        human.name="Lokesh Ghosh";
        human.height=176;
        human.leg=2;
        human.species="Homosepiens";
        human.hand=2;
        human.walk();
        human.id();
        human.touch();

        System.out.println(" ");

        animal cat = new animal();
        cat.name="Mellow";
        cat.height=20;
        cat.leg=4;
        cat.species="persian";
        cat.walk();
        cat.id();

        System.out.println(" ");

        animal human2=new animal();
        human2.name="Rahul Dutta";
        human2.height=189;
        human2.leg=2;
        human2.species="homosepiens";
        human2.hand=2;
        human2.id();
        human2.walk();
        human2.touch();

        System.out.println(" ");

        object car = new object();
        car.name="Tata Nexon";
        car.color="Sky Blue";
        car.height=5;
        car.wheel=4;
        car.speed=120;
        car.usage="I am used for transportation";
        car.price=1800000;
        car.species="Machines";
        car.id();
        car.move();
        car.use();
        car.cost();
        car.see();



        System.out.println(" ");


        object buliding = new object();
        buliding.name="Academic Building";
        buliding.color="white-blue";
        buliding.height=100;
        buliding.usage="Class is taken inside me";
        buliding.price=1000000000;
        buliding.species="Multi-Storey";
        buliding.id();
        buliding.walk();
        buliding.move();
        buliding.see();
        buliding.cost();
        buliding.use();






    }
}
