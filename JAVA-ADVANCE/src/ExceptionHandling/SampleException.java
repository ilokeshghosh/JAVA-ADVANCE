package ExceptionHandling;

public class SampleException {
    public static void main(String[] args) {
        String str = null;
//        System.out.println(str.length());  //It Will Throw a NUllPointerException

//        Arithmetic Exception
        try {
            int a=30;
            int b=0;
            int c=a/b;
            System.out.println("Result ="+c);
        }
        catch (ArithmeticException e){
            System.out.println("Can't Divide a number by zero");
        }

        //Number Format Exception
        try{
            int num= Integer.parseInt("Lokesh");
            System.out.println(num);
        }
        catch (NumberFormatException e){
            System.out.println("This is an example of number format Exception");
        }

        //Index Out Of Bounds Exception
        try{
            int[] x = new int[5];
           x[7]=30;
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("This is an example of Index Out Of Bounds Exception");
        }
    }
}
