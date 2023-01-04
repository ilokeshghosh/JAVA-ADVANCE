package ExceptionHandling;

public class Throw {
    static void avg(){
        try {
            throw new ArithmeticException("Demo");
//            System.out.println("hii");
        }
        catch (ArithmeticException e){
            System.out.println("Exception Caught");
        }
    }

    public static void main(String[] args) {
        avg();
    }
}
