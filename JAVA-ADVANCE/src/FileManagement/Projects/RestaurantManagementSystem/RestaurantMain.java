package FileManagement.Projects.RestaurantManagementSystem;


import java.io.*;
import java.util.*;

//file path : C:\Users\acer\Desktop\GIT REPO\JAVA-ADVANCE\JAVA-ADVANCE\src\FileManagement\Projects\RestaurantManagementSystem\Files
public class RestaurantMain {

    /*
    Issued Coupon

    code        amount

    lok20       100
    xyz         120
    abcd        150
    ryzen5      200
    gtx         250
    nitro5      50
    test        10


     */
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in); // For non-string input
        Scanner sc1= new Scanner(System.in); // For String Input

        String aName="admin";
        String aPass="admin";

        File file = new File("C:\\Users\\acer\\Desktop\\GIT REPO\\JAVA-ADVANCE\\JAVA-ADVANCE\\src\\FileManagement\\Projects\\RestaurantManagementSystem\\Files\\menu.txt");

        File couponFile = new File("C:\\Users\\acer\\Desktop\\GIT REPO\\JAVA-ADVANCE\\JAVA-ADVANCE\\src\\FileManagement\\Projects\\RestaurantManagementSystem\\Files\\coupon.txt");
        ObjectOutputStream oos= null;
        ObjectInputStream ois = null;
        ArrayList<Restaurant> list = new ArrayList<Restaurant>();

        ListIterator<Restaurant> li=null;

        HashMap<String , Integer>  couponList = new HashMap<String, Integer>();


        if(file.isFile()){
            ois= new ObjectInputStream(new FileInputStream(file));
            list=(ArrayList<Restaurant>)ois.readObject();
            ois.close();
        }


        if(couponFile.isFile()){
            ois= new ObjectInputStream(new FileInputStream(couponFile));
            couponList = (HashMap<String, Integer>)ois.readObject();
            ois.close();
        }

        System.out.println("\n\n\t\t\t\t****Welcome to FOOD BANK****\n\n\n");

        Menu.options();


    }
}