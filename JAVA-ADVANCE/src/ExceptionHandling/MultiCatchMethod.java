package ExceptionHandling;

public class MultiCatchMethod {
    public static void main(String[] args) {
        try{
            int[] x = new int[5];
            x[7]=10/0;
        }
        catch (ArithmeticException e){
            System.out.println("Can't Divide a number by zero");
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("This is an example of Index Out Of Bounds Exception");
        }
        catch (Exception e){
            System.out.println("parent exception occurs");
        }
        System.out.println("Rest of the code");
    }
}
