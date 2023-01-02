package ExceptionHandling;

public class Finally {
    public static void main(String[] args) {
        try{
            int num =10/0;
            System.out.println(num);
        }
        finally {
            System.out.println("This code will always executed");
        }
    }
}
