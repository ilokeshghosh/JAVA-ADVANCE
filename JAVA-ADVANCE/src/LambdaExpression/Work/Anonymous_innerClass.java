package LambdaExpression.Work;

@FunctionalInterface
interface  A{
    void show();
    String toString(); //since all class extends Object class so toString method can be used in Functional Interface

}


//class B implements  A{
//    @Override
//    public void show(){
//        System.out.println("hi");
//    }
//}


public class Anonymous_innerClass {
    public static void main(String[] args) {

//        B b = new B();
//        b.show();

        A a = new A(){ //this is called Anonymous InnerClass
         @Override
          public void show(){
              System.out.println("Hi from inner class ");
          }
        };
        a.show();

        //Lambda Expression
        A b = ()-> System.out.println("Hi from inner class using lambda expression");
        b.show();
    }
}
