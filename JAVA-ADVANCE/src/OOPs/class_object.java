package OOPs;
class pen{
    String color;
    String type; //ballpoint or gel

    public void write(){
        System.out.println("Write something");

    }
    public void printcolor(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;

    Student(){ //non-parametrised constructor
//         System.out.println("Constructor called successfully");
    }

//    Student(String name,int age){//parametrised constructor
//        this.name=name;
//        this.age=age;
//    }

    Student(Student s1){ //this is copy constructor
        this.name=s1.name;
        this.age=s1.age;
    }
    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);

    }

}
public class class_object {
    public static void main(String args[]){
//        pen pen1=new pen();
//        pen1.color="blue";
//        pen1.type="Gel";
////        pen1.write();
//
//        pen pen2=new pen();
//        pen2.color="black";
//        pen2.type="ballpoint";
//        pen1.printcolor();
//        pen2.printcolor();

        Student s1=new Student();
        s1.name="aman";
        s1.age=24;

        Student s2=new Student(s1);
        s2.printinfo();

    }
}
