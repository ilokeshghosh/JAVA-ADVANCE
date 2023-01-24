package FileManagement.Projects.RestaurantManagementSystem;

import java.io.*;
import java.util.*;

public class Admin {
    static String aName="admin";
    static String aPass="admin";
    static Scanner sc= new Scanner(System.in); // For non-string input
    static Scanner sc1= new Scanner(System.in); // For String Input


    static ObjectOutputStream oos= null;
    static ObjectInputStream ois = null;
    static ArrayList<Restaurant> list = new ArrayList<Restaurant>();

    static ListIterator<Restaurant> li=null;

   static File couponFile = new File("C:\\Users\\acer\\Desktop\\GIT REPO\\JAVA-ADVANCE\\JAVA-ADVANCE\\src\\FileManagement\\Projects\\RestaurantManagementSystem\\Files\\coupon.txt");
   static File file = new File("C:\\Users\\acer\\Desktop\\GIT REPO\\JAVA-ADVANCE\\JAVA-ADVANCE\\src\\FileManagement\\Projects\\RestaurantManagementSystem\\Files\\menu.txt");

    static File SaleFile = new File("C:\\Users\\acer\\Desktop\\GIT REPO\\JAVA-ADVANCE\\JAVA-ADVANCE\\src\\FileManagement\\Projects\\RestaurantManagementSystem\\Files\\bill.txt");

    static HashMap<String , Integer> couponList = new HashMap<String, Integer>();
    static void auth() throws IOException, ClassNotFoundException, InterruptedException {
//        boolean verify = false;

        do {

            System.out.print("------------------------------------\n");
            System.out.print("|-------------ADMIN LOGIN----------|\n");
            System.out.print("------------------------------------\n");
            System.out.print("|");
            System.out.print("Enter Admin UserName");
            System.out.print("\n-----------------------------------|\n");
            System.out.print("|");
            System.out.print("Enter Input : ");
            String IName=sc1.nextLine();
            System.out.print("-----------------------------------|\n");
            System.out.print("-----------------------------------|\n");
            System.out.print("|");
            System.out.print("Enter Admin Password");
            System.out.print("\n-----------------------------------|\n");
            System.out.print("|");
            System.out.print("Enter Input : ");
            String IPass= sc1.nextLine();
            System.out.print("-----------------------------------|\n\n\n");


            if(IPass.equals(aPass) && IName.equals(aName)){
                System.out.print("\n-----------------------------------|\n");
                System.out.print("|");
                System.out.print("Admin Verified");
                System.out.print("\n-----------------------------------|\n\n\n");
                AdminMenu();
            }
            else {
                System.out.print("\n-----------------------------------|\n");
                System.out.print("|");
                System.out.print("Incorrect UserName or Password..");
                System.out.print("\n-----------------------------------|\n");

                System.out.print("\n-----------------------------------|\n");
                System.out.print("|");
                System.out.print("Do you want to Try again (y/n)");
                System.out.print("\n-----------------------------------|\n");
                System.out.print("|");
                System.out.print("Enter Input : ");
                char op = sc.next().charAt(0);
                System.out.print("-----------------------------------|\n\n\n");
                if(op!='y'){
                    break;
                }
            }
        }while (true);
    }

    static void AdminMenu() throws ClassNotFoundException, InterruptedException, IOException {
            do {
                System.out.print("------------------------------------\n");
                System.out.print("|----------ADMIN DASHBOARD---------|\n");
                System.out.print("------------------------------------\n");
                System.out.print("|");
                System.out.print("1)Add  Food Item in Menu");
                System.out.print("\n-----------------------------------|\n");
                System.out.print("|");
                System.out.print("2)Update Food Item in  Menu");
                System.out.print("\n-----------------------------------|\n");
                System.out.print("|");
                System.out.print("3)Read Food Item From Menu");
                System.out.print("\n-----------------------------------|\n");
                System.out.print("|");
                System.out.print("4)Delete Food Item from Menu");
                System.out.print("\n-----------------------------------|\n");
                System.out.print("|");
                System.out.print("5)Issue Coupon");
                System.out.print("\n-----------------------------------|\n");
                System.out.print("|");
                System.out.print("6)Display Coupon");
                System.out.print("\n-----------------------------------|\n");
                System.out.print("|");
                System.out.print("7)Delete Coupon");
                System.out.print("\n-----------------------------------|\n");
                System.out.print("|");
                System.out.print("8)Display Total Sale");
                System.out.print("\n-----------------------------------|\n");
                System.out.print("|");
                System.out.print("0)LOG OUT");
                System.out.print("\n-----------------------------------|\n");
                System.out.print("|");
                int op1=-1;
                System.out.print("Enter Input : ");
                op1 = sc.nextInt();
                System.out.print("-----------------------------------|\n\n\n");
                switch (op1) {
                    case 0 -> Menu.options();
                    case 1 -> AddFood();
                    case 2 -> UpdateFood();
                    case 3 -> DisplayItem();
                    case 4 -> DeleteItem();
                    case 5 -> IssueCoupon();
                    case 6 -> DisplayCoupon();
                    case 7 -> DeleteCoupon();
                    case 8 -> TotalSale.DisplayTotalSale();
                    default -> {
                        System.out.print("\n-----------------------------------|\n");
                        System.out.print("|");
                        System.out.print("CHOSEN OPTION");
                        System.out.print("\n-----------------------------------|\n");
                    }
                }
            } while (true);
    }

    static void AddFood() throws IOException, ClassNotFoundException, InterruptedException {
        if(file.isFile()){
            ois= new ObjectInputStream(new FileInputStream(file));
            list=(ArrayList<Restaurant>)ois.readObject();
            ois.close();

        System.out.print("------------------------------------\n");
        System.out.print("|-----ADDING FOOD ITEMS TO MENU----|\n");
        System.out.print("------------------------------------\n");
        System.out.print("|");
        System.out.print("Enter Number of Food Items");
        System.out.print("\n-----------------------------------|\n");
        System.out.print("|");
        int op3= sc.nextInt();
        System.out.print("-----------------------------------|\n\n\n");


        for (int i=0;i<op3;i++){

            System.out.print("------------------------------------\n");
            System.out.print("|----GETTING DETAILS FROM ADMIN----|\n");
            System.out.print("------------------------------------\n");
            System.out.print("|");
            System.out.print("Enter Food Id");
            System.out.print("\n-----------------------------------|\n");
            System.out.print("|");
            int fId = sc.nextInt();
            System.out.print("-----------------------------------|\n");
            System.out.print("|");
            System.out.print("Enter Food Name");
            System.out.print("\n-----------------------------------|\n");
            System.out.print("|");
            String fName = sc1.nextLine();
            System.out.print("-----------------------------------|\n");
            System.out.print("|");
            System.out.print("Enter Food Price");
            System.out.print("\n-----------------------------------|\n");
            System.out.print("|");
            int price = sc.nextInt();
            System.out.print("-----------------------------------|\n\n\n");

            list.add(new Restaurant(fId,fName,price));

        }
        oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(list);
        oos.close();
        }
        else {
            System.out.print("\n-----------------------------------|\n");
            System.out.print("|");
            System.out.print("File Not Exist......!!");
            System.out.print("\n-----------------------------------|\n\n\n");
            Thread.sleep(1000);
        }
    }




    static void UpdateFood() throws IOException, ClassNotFoundException, InterruptedException {
      if(file.isFile()){
            ois = new ObjectInputStream(new FileInputStream(file));
            list=(ArrayList<Restaurant>)ois.readObject();
            ois.close();
            boolean found = false;
            System.out.print("------------------------------------\n");
            System.out.print("|-----UPDATING DETAILS OF FOOD-----|\n");
            System.out.print("------------------------------------\n");
            System.out.print("|");
            System.out.print("Enter Food Id");
            System.out.print("\n-----------------------------------|\n");
            System.out.print("|");
            int fId = sc.nextInt();
            System.out.print("-----------------------------------|\n\n\n");



            li = list.listIterator();
            while (li.hasNext()){
                Restaurant e= (Restaurant) li.next();
                if(e.fId==fId){
                    System.out.print("------------------------------------\n");
                    System.out.print("|------GETTING DETAILS OF FOOD-----|\n");
                    System.out.print("------------------------------------\n");
                    System.out.print("|");
                    System.out.print("Enter New Food Name");
                    System.out.print("\n-----------------------------------|\n");
                    System.out.print("|");
                    String fName= sc1.nextLine();
                    System.out.print("-----------------------------------|\n");

                    System.out.print("|");
                    System.out.print("Enter New Food Price");
                    System.out.print("\n-----------------------------------|\n");
                    System.out.print("|");
                    int Price= sc.nextInt();
                    System.out.print("-----------------------------------|\n\n\n");

                    li.set(new Restaurant(fId, fName,Price));
                    found=true;
                }
            }
            if(found){
                oos= new ObjectOutputStream(new FileOutputStream(file));
                oos.writeObject(list);
                oos.close();

                System.out.print("\n-----------------------------------|\n");
                System.out.print("|");
                System.out.print("Menu Updated Successfully");
                System.out.print("\n-----------------------------------|\n\n\n");
                Thread.sleep(1000);

            }
            else {
                System.out.print("\n-----------------------------------|\n");
                System.out.print("|");
                System.out.print("Record Not Found");
                System.out.print("\n-----------------------------------|\n\n\n");
                Thread.sleep(1000);

            }
        }
        else {
            System.out.print("\n-----------------------------------|\n");
            System.out.print("|");
            System.out.print("File Not Exist......!!");
            System.out.print("\n-----------------------------------|\n\n\n");
            Thread.sleep(1000);
        }
    }



    static void DisplayItem() throws IOException, ClassNotFoundException, InterruptedException {
        if(file.isFile()){
            ois = new ObjectInputStream(new FileInputStream(file));
            list = (ArrayList<Restaurant>)ois.readObject();
            ois.close();
            System.out.print("------------------------------------------------------------------------------------------------------------\n");
            System.out.print("|----------------------------------------| RESTAURANT MENU |-------------------------------------------------|\n");
            System.out.print("-------------------------------------------------------------------------------------------------------------\n");
            System.out.print("|------------------------------------------------------------------------------------------------------------|\n");
            System.out.print("|  FOOD ID  |"+"\t\t\t\t\t\t\t\t"+"|  FOOD NAME  |"+"\t\t\t\t\t\t\t\t\t  "+"|  FOOD PRICE  |");
            System.out.print("\n|------------------------------------------------------------------------------------------------------------|\n");




            for(int i=0;i<list.size();i++){
                Restaurant e= (Restaurant)list.get(i);
              System.out.print(" \t "+e.fId+"\t\t\t\t\t\t\t\t"+e.fname+" \t\t\t\t \t \t\t\t\t\t\t\t "+e.price);
                System.out.println("\n|------------------------------------------------------------------------------------------------------------|");
            }
            System.out.print("\n\n\n");

        }
        else{
            System.out.print("\n-----------------------------------|\n");
            System.out.print("|");
            System.out.print("File Not Exist......!!");
            System.out.print("\n-----------------------------------|\n\n\n");
            Thread.sleep(1000);
        }

    }



    static void DeleteItem() throws IOException, ClassNotFoundException, InterruptedException {
        if(file.isFile()){
            ois = new ObjectInputStream(new FileInputStream(file));
            list = (ArrayList<Restaurant>)ois.readObject();
            ois.close();
            boolean found = false;

            System.out.print("------------------------------------\n");
            System.out.print("|---DELETING FOOD ITEMS FROM MENU---|\n");
            System.out.print("------------------------------------\n");
            System.out.print("|");
            System.out.print("Enter Food Id to Delete");
            System.out.print("\n-----------------------------------|\n");
            System.out.print("|");
            int fId = sc.nextInt();
            System.out.print("-----------------------------------|\n\n\n");


            li = list.listIterator();

            while (li.hasNext()){
                Restaurant e= li.next();
                if (e.fId==fId){
                    li.remove();
                    found=true;
                }
            }
            if(found){
                oos= new ObjectOutputStream(new FileOutputStream(file));
                oos.writeObject(list);
                oos.close();
                System.out.print("\n-----------------------------------|\n");
                System.out.print("|");
                System.out.print("Food Item Deleted Successfully");
                System.out.print("\n-----------------------------------|\n\n\n");
                Thread.sleep(1000);

            }
            else {
                System.out.print("\n-----------------------------------|\n");
                System.out.print("|");
                System.out.print("Record Not found");
                System.out.print("\n-----------------------------------|\n\n\n");

            }

        }
        else{
            System.out.print("\n-----------------------------------|\n");
            System.out.print("|");
            System.out.print("File Not Exist......");
            System.out.print("\n-----------------------------------|\n\n\n");
        }
    }



    static void IssueCoupon() throws IOException {

        System.out.print("------------------------------------\n");
        System.out.print("|----------ISSUEING COUPON----------|\n");
        System.out.print("------------------------------------\n");
        System.out.print("|");
        System.out.print("Enter the Number of Coupons");
        System.out.print("\n-----------------------------------|\n");
        System.out.print("|");
        int CCount=sc.nextInt();
        System.out.print("-----------------------------------|\n\n");

        for(int i=0;i<CCount;i++){
            System.out.print("\n-----------------------------------|\n");
            System.out.print("|");
            System.out.print("Enter Coupon Code");
            System.out.print("\n-----------------------------------|\n");
            System.out.print("|");
            String CCode= sc1.nextLine();
            System.out.print("-----------------------------------|\n");
            System.out.print("|");
            System.out.print("Enter amount of discount");
            System.out.print("\n-----------------------------------|\n");
            System.out.print("|");
            int CPrice= sc.nextInt();
            System.out.print("-----------------------------------|\n\n\n");

            couponList.put(CCode,CPrice);
        }
        System.out.print("\n-----------------------------------|\n");
        System.out.print("|");
        System.out.print("Coupon Issued");
        System.out.print("\n-----------------------------------|\n\n\n");
        oos=new ObjectOutputStream(new FileOutputStream(couponFile));
        oos.writeObject(couponList);
        oos.close();


    }



    //Displaying Coupon
    static void DisplayCoupon() throws IOException, ClassNotFoundException, InterruptedException {
            if(couponFile.isFile()){
                ois = new ObjectInputStream(new FileInputStream(couponFile));
                couponList = (HashMap<String, Integer>) ois.readObject();
                ois.close();




                if (!couponList.isEmpty()){

                    System.out.print("------------------------------------\n");
                    System.out.print("|-------|  ISSUED COUPON  |--------|\n");
                    System.out.print("------------------------------------\n");
                    System.out.print("| Coupon Code |"+"\t\t\t"+"| Discount |");
                    System.out.print("\n|----------------------------------|\n");

                    for(Map.Entry<String,Integer> e: couponList.entrySet()){


                        System.out.print("|\t"+e.getKey()+"\t\t\t\t\t"+e.getValue()+"\t   |");
                        System.out.print("\n|----------------------------------|\n");

                    }
                    System.out.print("\n\n\n");
                }
                else {
                    System.out.print("\n-----------------------------------|\n");
                    System.out.print("|");
                    System.out.print("NO ISSUED COUPON......!!");
                    System.out.print("\n-----------------------------------|\n\n\n");
                    Thread.sleep(1000);
                }


            }
            else {
                System.out.print("\n-----------------------------------|\n");
                System.out.print("|");
                System.out.print("File Not Exist......!!");
                System.out.print("\n-----------------------------------|\n\n\n");
                Thread.sleep(1000);
            }
    }




    //Delete Coupon
    static void DeleteCoupon() throws IOException, ClassNotFoundException, InterruptedException {
        if (couponFile.isFile()){
            ois = new ObjectInputStream(new FileInputStream(couponFile));
            couponList = (HashMap<String, Integer>) ois.readObject();
            ois.close();
            boolean found = false;

            System.out.print("------------------------------------\n");
            System.out.print("|----------DELETING COUPON---------|\n");
            System.out.print("------------------------------------\n");
            System.out.print("|");
            System.out.print("Enter Food Id to Delete");
            System.out.print("\n-----------------------------------|\n");
            System.out.print("|");
            String  CId = sc1.nextLine();
            System.out.print("-----------------------------------|\n\n\n");

            Iterator it =couponList.entrySet().iterator();

            while (it.hasNext()){
                Map.Entry item = (Map.Entry) it.next();
                if(item.getKey().equals(CId)){
                    found = true;
                    it.remove();
                }


            }
            if (found){
                oos = new ObjectOutputStream(new FileOutputStream(couponFile));
                oos.writeObject(couponList);
                oos.close();
                System.out.print("\n-----------------------------------|\n");
                System.out.print("|");
                System.out.print("Coupon Deleted Successfully");
                System.out.print("\n-----------------------------------|\n\n\n");
                Thread.sleep(1000);

            }
            else {
                System.out.print("\n-----------------------------------|\n");
                System.out.print("|");
                System.out.print("Invalid Coupon Code ");
                System.out.print("\n-----------------------------------|\n\n\n");
                Thread.sleep(1000);
            }

        }
    }



    //Total Sells
    static void TotalSells(){

    }








}
