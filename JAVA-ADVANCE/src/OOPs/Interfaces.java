package OOPs;
interface Animals{
     public void walk();
     int eyes=2;
//     void eat();
}

interface Herbivore{

}
class Horses implements Animals,Herbivore{ //This multiple inheritance which is only done by interfaces in java
     public void walk(){
          System.out.println("walks on 4 legs");
     }

}
public class Interfaces {
     public static void main(String[] args){
          Horses horse=new Horses();
          horse.walk();

     }
}
