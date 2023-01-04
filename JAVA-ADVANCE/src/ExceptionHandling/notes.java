package ExceptionHandling;

public class notes {
    public static void main(String[] args) {
        /*

        Url : https://www.geeksforgeeks.org/types-of-exception-in-java-with-examples/

         How virtual machine handles exceptions?
         -> When a exception is occured inside method then the method create a object called exception object.
         After creating the exception object then the object is passed to Runtime System.
         The exception object is contains name , description and the current state of the program where exception is occured.
         The process of creating object and handling to Runtime System is called Throwing a exception.

         Exception is handled by Try,Catch,Finally methods


         Kinds of Exceptions:
            1)Checked Exception -> # An Exception that is checked by compiler at compilation-time.
                                   # These exceptions cannot simply be ignored, the programmer should handle
                                       these exceptions.
                                   # Exceptions like : I/O , SQLException

            2) Unchecked Exceptions -> # An Exception that occurs at the time of exception.
                                       # These are also called as Runtime Exceptions.
                                       # Runtime Exceptions are ignored at the time of compilation.

                                       Exceptions like : Divide By 0, Array out of Bound, Null Pointer Exceptions etc


            Syntax of Exception:

            try{
                //Code that may raise Exception
              }
             catch(Exception e){
                //Rest of the program
             }


        Types of Exceptions(In terms of origin):
            1)Built-in Exceptions -> These exceptions are available in java libraries
            2)User Defined Exceptions ->


            ********Built-in Exceptions******
             1)ArithmeticException
             2)ArrayIndexOutofBoundException
             3)ClassNotFoundException
             4)IOException
             5)InterruptedException
             6)NoSuchFieldException
             7)NoSuchMethodException
             8)NumberFormatException
             9)Runtime Exception
             10)StringIndexOutOfBoundException


             Exception Handling Methods :
                1)try
                2)catch
                3)finally
                4)throw
                5)throws

            ****try*****
            # Used to specify a block  where we should place exception code.
            # Nested try can be used.

            Syntax:

            try{
                ///Code that throws exception
                } catch(Exception_Class_Name){}


            ****catch****
            # used to handle the exception.
            # Multi-Catch methods are also used


            try{//proctected code}
            catch(ExceptionName e1){
            //catch block
            }


            Multi-Catch methods syntax
            try{//protected code}
            catch(Exception e1){//Catch Block}
            catch(Exception e2){//Catch Block}
            catch(Exception e3){//Catch Block}


            ****finally****
            Used to execute the important code of the program.

            Syntax:

            try{
                //Protected Code
               }


               catch(Exception e1{
               //catch Block
               }
               finally{

               //This block is always executed

               }


               ****throw****
               This is a keyword used to throw an exception

               Syntax:

               void a(){
               throw new ArithmeticException("Incorrect");
               }


               ****throws****
               Used to declare Exceptions

               Systax:

               void a()throws ArithmeticException{}


                                #Difference between throw and throws#

               throw                                              ` throws
               1.Used to explicity throw an                        1.Used to declare an Exception
                Exception
               2.Checked Exceptions cannot                         2.Checked Exceptions can be propagated.
                be propagated using throw only
               3.Followed by an instance                           3.Followed by a class.
               4. Cannot throw mulitple exceptions                 4.Used with a method Signature
                                                                   5.Can declare multiple Exceptions.



                                ## Difference Between Final vs Finally vs Finalize ##
                 Final                                  Finally                 Finalize
                 1.Keyword                              1.Block                 1.Method
                 2.Applies restrictions on              2.Used to place an      2.Used to perform clean-up
                 class, methods and variable.           important code          just before the object is
                                                                                garbage collected.
                 3.final class can't be inherited,      3.It will be executed
                 method can't be overridden & the       whether the exception
                 variable value can't be changed        is handled or not.

                 # User-Defined Exception #
                 1. user-defined exception must extends the exception class
                 2. a exception is thrown using throw keyword
         */
    }
}
