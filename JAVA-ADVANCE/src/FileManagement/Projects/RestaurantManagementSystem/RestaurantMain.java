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

            switch (op){
                case 0:
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
                case 1:
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
                            System.out.print("0)Exit From System");
                            System.out.print("\n-----------------------------------|\n");
                            System.out.print("|");
                            System.out.print("Enter Input : ");
                            int op1=sc.nextInt();
                            System.out.print("-----------------------------------|\n\n\n");




//                            System.out.println("1)Add  Food Item in Menu");
//                            System.out.println("2)Update Food Item in  Menu");
//                            System.out.println("3)Read Food Item From Menu");
//                            System.out.println("4)Delete Food Item from Menu");
//                            System.out.println("5)Issue Coupon");
//                            System.out.println("0)Exit From System");
//                            int op1=sc.nextInt();



                            switch (op1){
                                case 0:
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

                                case 1:

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
                                    break;
                                case 2:
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
                                            Thread.sleep(3000);

                                        }
                                        else {
                                            System.out.print("\n-----------------------------------|\n");
                                            System.out.print("|");
                                            System.out.print("Record Not Found");
                                            System.out.print("\n-----------------------------------|\n\n\n");
                                            Thread.sleep(3000);

                                        }
                                    }
                                    else {
                                        System.out.print("\n-----------------------------------|\n");
                                        System.out.print("|");
                                        System.out.print("File Not Exist......!!");
                                        System.out.print("\n-----------------------------------|\n\n\n");
                                        Thread.sleep(3000);
                                    }
                                    break;

                                case 3:
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
//                                            System.out.println("\t "+e.fId+"\t\t\t\t\t\t\t\t\t\t\t"+e.fname+"\t\t\t\t\t\t\t\t\t\t"+e.price);
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
                                        Thread.sleep(3000);
                                    }
                                    break;
                                case 4:
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
                                            Thread.sleep(3000);

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
                                    break;

                                case 5:

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

                                    break;



                            }
                        }while (true);

                    }
                    else {
                        System.out.print("\n-----------------------------------|\n");
                        System.out.print("|");
                        System.out.print("Incorrect UserName or Password..");
                        System.out.print("\n-----------------------------------|\n\n\n");

                    }
                    break;


                case 2:
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
                    break;

            }

        }while (true);

    }
}