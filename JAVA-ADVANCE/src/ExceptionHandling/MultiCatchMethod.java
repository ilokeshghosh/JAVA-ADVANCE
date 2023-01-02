package ExceptionHandling;

public class MultiCatchMethod {
    public static void main(String[] args) {
        try{
            int a=30;
            int b=0;
            int c=a/b;
            System.out.println("Result ="+c);

            int num= Integer.parseInt("Lokesh");
            System.out.println(num);

            int[] x = new int[5];
            x[7]=30;
        }
        catch (ArithmeticException e){
            System.out.println("Can't Divide a number by zero");
        }

        catch (NumberFormatException e){
            System.out.println("This is an example of number format Exception");
        }

        catch (IndexOutOfBoundsException e){
            System.out.println("This is an example of Index Out Of Bounds Exception");
        }
    }
}
