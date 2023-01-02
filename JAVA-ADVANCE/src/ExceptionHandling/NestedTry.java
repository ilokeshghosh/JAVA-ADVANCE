package ExceptionHandling;

public class NestedTry {
    public static void main(String[] args) {


     try {

         //nested try block
         //Number Format Exception
         try{
             int num= Integer.parseInt("Lokesh");
             System.out.println(num);
         }
         catch (NumberFormatException e){
             System.out.println("This is an example of number format Exception");
         }

         //Another nested try block
         //Index Out Of Bounds Exception
         try{
             int[] x = new int[5];
             x[7]=30;
         }
         catch (IndexOutOfBoundsException e){
             System.out.println("This is an example of Index Out Of Bounds Exception");
         }


         System.out.println("Other Statement");


     }
     catch (Exception e){
         System.out.println("Exception Handled and recovered"); //since outermost try block doesn't throw any exception so this will not print
     }
    }
}
