package FileManagement;
import java.io.*;
import java.util.*;

public class CreateFileDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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

    }
}
