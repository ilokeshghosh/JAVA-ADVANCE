package FileManagement.Projects.RestaurantManagementSystem;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import static FileManagement.Projects.RestaurantManagementSystem.Admin.*;

public class Menu {
    static Scanner sc= new Scanner(System.in); // For non-string input
    static Scanner sc1= new Scanner(System.in); // For String Input

   static ObjectOutputStream oos= null;
    static ObjectInputStream ois = null;
    static ArrayList<Restaurant> list = new ArrayList<Restaurant>();
    static void options() throws IOException, ClassNotFoundException, InterruptedException ,WrongInputException{

        do {
            System.out.print("------------------------------------\n");
            System.out.print("|--------------OPTIONS-------------|\n");
            System.out.print("------------------------------------\n");
            System.out.print("|");
            System.out.print("1)Admin Login");
            System.out.print("\n-----------------------------------|\n");
            System.out.print("|");
            System.out.print("2)Check Menu And Order");
            System.out.print("\n-----------------------------------|\n");
            System.out.print("|");
            System.out.print("0)Exit");


            System.out.print("\n-----------------------------------|\n");
            System.out.print("|");
            System.out.print("Enter Any Option : ");
            int op= sc.nextInt();
            System.out.print("------------------------------------\n\n\n");


            switch (op) {
                case 0 -> {
                    System.out.print("\n-----------------------------------|\n");
                    System.out.print("|");
                    System.out.print("You Choosen to Exit the System");
                    System.out.print("\n-----------------------------------|\n");
                    Thread.sleep(3000);
                    System.out.print("-----------------------------------|\n");
                    System.out.print("|");
                    System.out.print("Exiting System......in few seconds");
                    System.out.print("\n-----------------------------------|\n");
                    Thread.sleep(3000);
                    System.out.print("-----------------------------------|\n");
                    System.out.print("|");
                    System.out.print("Exited System");
                    System.out.print("\n-----------------------------------|\n\n");
                    System.exit(0);
                }
                case 1 -> {
                    auth();

                }
                case 2 -> menu();
                default -> {
                    System.out.print("\n-----------------------------------|\n");
                    System.out.print("|");
                    System.out.print("WRONG INPUT !!!");
                    System.out.print("\n-----------------------------------|\n");
                }
            }




        }while (true);




    }

    static void menu() throws IOException, ClassNotFoundException, InterruptedException {
        File file = new File("C:\\Users\\acer\\Desktop\\GIT REPO\\JAVA-ADVANCE\\JAVA-ADVANCE\\src\\FileManagement\\Projects\\RestaurantManagementSystem\\Files\\menu.txt");
        if(file.isFile()){
            ois = new ObjectInputStream(new FileInputStream(file));
            list=(ArrayList<Restaurant>)ois.readObject();
            ois.close();

            System.out.print("------------------------------------------------------------------------------------------------------------\n");
            System.out.print("|----------------------------------------| RESTAURANT MENU |-------------------------------------------------|\n");
            System.out.print("-------------------------------------------------------------------------------------------------------------\n");
            System.out.print("|------------------------------------------------------------------------------------------------------------|\n");
            System.out.print("|  FOOD ID  |"+"\t\t\t\t\t\t\t\t"+"|  FOOD NAME  |"+"\t\t\t\t\t\t\t\t\t  "+"|  FOOD PRICE  |");
            System.out.print("\n|------------------------------------------------------------------------------------------------------------|\n");

            for(int i=0;i<list.size();i++){
                Restaurant e= (Restaurant)list.get(i);
//                            System.out.println("\t"+e.fId+"\t\t\t\t\t\t\t\t\t\t"+e.fname+" \t\t\t\t\t\t\t\t\t\t\t\t\t"+e.price+"");
                System.out.print(" \t "+e.fId+"\t\t\t\t\t\t\t\t"+e.fname+" \t\t\t\t \t \t\t\t\t\t\t\t "+e.price);
                System.out.println("\n|------------------------------------------------------------------------------------------------------------|");
            }
            System.out.print("\n\n\n");


            do {
                System.out.print("\n-----------------------------------------|\n");
                System.out.print("|");
                System.out.print("Enter the Id of Food You Want to Order");
                System.out.print("\n-----------------------------------------|\n");
                System.out.print("|");
                System.out.print("Enter Input : ");
                int fId = sc.nextInt();
                System.out.print("-----------------------------------------|\n\n\n");

//
                for(Restaurant e: list){
                    if(e.fId==fId){
                        Billing.order(e.fname, e.price);
                        Billing.cont();
                    }
                }


            }while (true);



        }
        else{
            System.out.print("\n-----------------------------------|\n");
            System.out.print("|");
            System.out.print("File Not Exist......!!");
            System.out.print("\n-----------------------------------|\n\n\n");
            Thread.sleep(3000);
        }

    }
}
