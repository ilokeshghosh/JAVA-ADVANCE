package ExceptionHandling;
import  java.util.*;
public class CustomException {
    static void validateInput(int num) throws InvalidInputException{
        if(num>100){
            throw new InvalidInputException("Exception");

        }
        System.out.println("Valid Input ");
    }




    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number less than 100 : ");
        int num = sc.nextInt();

        try {
            validateInput(num);
        }
        catch (InvalidInputException e){
            System.out.println("Caught Exception - Input is greater than 100");
        }
    }



    static class InvalidInputException extends Exception{
        InvalidInputException(String exceptionText){
            super(exceptionText);
        }
    }
}
