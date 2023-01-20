package FileManagement;
import java.io.*;
import java.util.*;

public class CreateFileDemo {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

//        file path :   C:\Users\acer\Desktop\GIT REPO\JAVA-ADVANCE\JAVA-ADVANCE\src\FileManagement\files

        /*
        try {
            // Creating an object of a file
            File f= new File("C:\\Users\\acer\\Desktop\\GIT REPO\\JAVA-ADVANCE\\JAVA-ADVANCE\\src\\FileManagement\\files\\test.txt");




            if (f.createNewFile()) {
                System.out.println("File " + f.getName() + " is created successfully.");
            } else {
                System.out.println("File is already exist in the directory.");
            }
        } catch (IOException exception) {
            System.out.println("An unexpected error is occurred.");
            exception.printStackTrace();
        }

        */


        //Writing a file

        /*
        int a=10;

        try{
            FileWriter  fileWriter = new FileWriter("lokesh.txt");
//            fileWriter.
            fileWriter.write("This is our first file from ");
            fileWriter.close();

        }
        catch (IOException e){
            System.out.println("File not created");
//            e.printStackTrace();
        }

*/
        //Reading a file

        /*
        File myFile = new File("lokesh.txt");
        try {
            Scanner sc= new Scanner(myFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not Found");
        }
        */

        File myFile = new File("lokesh.txt");
        if(myFile.delete()){
            System.out.println("i have deleted  : "+myFile.getName());

        }
        else {
            System.out.println("Some problem occurred while deleting the file ");
        }





    }
}
