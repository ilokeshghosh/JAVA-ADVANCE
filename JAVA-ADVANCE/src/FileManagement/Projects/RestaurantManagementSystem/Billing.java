package FileManagement.Projects.RestaurantManagementSystem;


import java.util.*;
import java.io.*;

//path : C:\Users\acer\Desktop\GIT REPO\JAVA-ADVANCE\JAVA-ADVANCE\src\FileManagement\Projects\RestaurantManagementSystem\Files
public class Billing {




    static ArrayList<Bill>  list = new ArrayList<Bill>();
    static String  coupon = "A12Z";
    static Scanner sc = new Scanner(System.in);
   static Scanner sc1= new Scanner(System.in); // For String Input

    static ListIterator<TotalSale> li=null;

//    food name, count , sale


    static ArrayList<TotalSale> TotalSaleList = new ArrayList<>();

    static File TotalSaleFile = new File("C:\\Users\\acer\\Desktop\\GIT REPO\\JAVA-ADVANCE\\JAVA-ADVANCE\\src\\FileManagement\\Projects\\RestaurantManagementSystem\\Files\\bill.txt");


    static ObjectOutputStream oos= null;
    static ObjectInputStream ois = null;




    static void order(String fname, int amt) {
        System.out.print("\n-----------------------------------|\n");
        System.out.print("|");
        System.out.print("Enter the quantity for "+fname+" : ");
        System.out.print("\n-----------------------------------|\n");
        System.out.print("|");
        System.out.print("Enter Input : ");
        int qty = sc.nextInt();
        System.out.print("-----------------------------------|\n\n\n");




        list.add(new Bill(fname, qty, amt*qty));
    }

    static void cont() throws InterruptedException, IOException, ClassNotFoundException {
        System.out.print("\n-----------------------------------|\n");
        System.out.print("|");
        System.out.print("Do you want to continue : y/n");
        System.out.print("\n-----------------------------------|\n");
        System.out.print("|");
        System.out.print("Enter Input : ");
        char ch = sc.next().charAt(0);
        System.out.print("-----------------------------------|\n\n\n");




        if((ch!='y')) {
            System.out.println();


            System.out.print("\n-----------------------------------|\n");
            System.out.print("|");
            System.out.print("Do you have coupon : y/n");
            System.out.print("\n-----------------------------------|\n");
            System.out.print("|");
            System.out.print("Enter Input : ");
            char ch2 = sc.next().charAt(0);
            System.out.print("-----------------------------------|\n\n\n");



            if(ch2=='y') {

                File couponFile = new File("C:\\Users\\acer\\Desktop\\GIT REPO\\JAVA-ADVANCE\\JAVA-ADVANCE\\src\\FileManagement\\Projects\\RestaurantManagementSystem\\Files\\coupon.txt");
                ObjectOutputStream oos = null;
                ObjectInputStream ois = null;
                HashMap<String, Integer> couponList = new HashMap<String, Integer>();

                if (couponFile.isFile()) {
                    ois = new ObjectInputStream(new FileInputStream(couponFile));
                    couponList = (HashMap<String, Integer>) ois.readObject();
                    ois.close();
                    boolean found =false;
                    System.out.print("\n-----------------------------------|\n");
                    System.out.print("|");
                    System.out.print("Enter you Coupon code :");
                    System.out.print("\n-----------------------------------|\n");
                    System.out.print("|");
                    System.out.print("Enter Input : ");
                    String uCoupon = sc1.nextLine();
                    System.out.print("-----------------------------------|\n\n\n");


                    for(Map.Entry<String, Integer> e: couponList.entrySet()){
                        if(e.getKey().equals(uCoupon)){
                            System.out.print("\n-----------------------------------|\n");
                            System.out.print("|");
                            System.out.print("Discount Applied ");
                            System.out.print("\n-----------------------------------|\n\n\n");
                            Thread.sleep(1000);
                            totalbill(e.getValue());
                            System.exit(0);

                        }
                    }
                    System.out.print("\n-----------------------------------|\n");
                    System.out.print("|");
                    System.out.print("Invalid Coupon Code");
                    System.out.print("\n-----------------------------------|\n\n\n");
                    Thread.sleep(3000);
                    totalbill(20);
                    System.exit(0);
            }else {
                    System.out.print("\n-----------------------------------|\n");
                    System.out.print("|");
                    System.out.print("File Not Exist......!!");
                    System.out.print("\n-----------------------------------|\n\n\n");
                    Thread.sleep(3000);
                }
            }
            else {
                totalbill(20);
                System.exit(0);
            }
        }


    }

    static void totalbill(int dis) throws IOException, ClassNotFoundException {

        if(TotalSaleFile.isFile()){
            ois = new ObjectInputStream(new FileInputStream(TotalSaleFile));
            TotalSaleList = (ArrayList<TotalSale>)ois.readObject();
            ois.close();

        }



        System.out.println();

        System.out.print("-------------------------------------------------------------------------------------------------------------\n");
        System.out.print("|----------------------------------| CHECK-OUT AND ORDER SUMMARY |-------------------------------------------|\n");
        System.out.print("-------------------------------------------------------------------------------------------------------------\n");
        System.out.print("|------------------------------------------------------------------------------------------------------------|\n");
        System.out.print("|  ITEMS  |"+"\t\t\t\t\t\t\t\t"+"|  QUANTITY  |"+"\t\t\t\t\t\t\t\t\t  "+"|  AMOUNT  |"+" \t \t |");
        System.out.print("\n|------------------------------------------------------------------------------------------------------------|\n");


       int count=0;
       double TotalAmount=0;
       double total=0;
        boolean found = false;

        for(Bill b: list) {
            System.out.println("| \t"+b.fname+"\t\t\t\t\t\t\t\t\t\t"+b.qty+" \t\t\t\t\t\t\t\t\t\t\t₹"+b.amt+"    \t \t | ");
            System.out.print("|------------------------------------------------------------------------------------------------------------|\n");

            li= TotalSaleList.listIterator();

            while (li.hasNext()){
                TotalSale e=(TotalSale) li.next();
                if(Objects.equals(b.fname, e.fName)){

                    li.set(new TotalSale(e.fName, e.count+1, e.TotalAmount+b.amt));
                    found = true;
                }
            }
            if (found){
                oos= new ObjectOutputStream(new FileOutputStream(TotalSaleFile));
                oos.writeObject(TotalSaleList);
                oos.close();
            }





            total = total+b.amt;



        }
        System.out.println("| \t"+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+"TOTAL - ₹"+total+"   \t \t | ");
        System.out.print("|------------------------------------------------------------------------------------------------------------|\n");



        try{

            System.out.print("\n\n\n----------------------------------------\n");
            System.out.print("|-------| ORDER TRACKING |-------------|\n");
            System.out.print("----------------------------------------\n");


            //Cooking food
            System.out.print("\n-----------------------------------|\n");
            System.out.print("|");
            System.out.print("Cooking Your Food");

//            for(int i=0;i<5;i++){
//                System.out.print(".");
//                Thread.sleep(1000);
//            }
//
//            System.out.print("\n-----------------------------------|\n");
//            Thread.sleep(1000);


            //Packing food
            System.out.print("\n-----------------------------------|\n");
            System.out.print("|");
            System.out.print("Packing your food");

//            for(int i=0;i<5;i++){
//                System.out.print(".");
//                Thread.sleep(1000);
//            }
//
//            System.out.print("Done");
//            Thread.sleep(1000);
//
//            System.out.print("\n-----------------------------------|\n");
//            Thread.sleep(1000);


            //Making Bill
            System.out.print("\n-----------------------------------|\n");
            System.out.print("|");
            System.out.print("Making Bill");


//            for(int i=0;i<5;i++){
//                System.out.print(".");
//                Thread.sleep(1000);
//            }
//
//            System.out.print("Done");
//            Thread.sleep(1000);
//
//            System.out.print("\n-----------------------------------|\n");
//            Thread.sleep(1000);



            //Here Is your order
            System.out.print("\n-----------------------------------|\n");
            System.out.print("|");
            System.out.print("Here is your order");

//            for(int i=0;i<5;i++){
//                System.out.print(".");
//                Thread.sleep(1000);
//            }
//
//
//
//            System.out.print("\n-----------------------------------|\n");
//            Thread.sleep(1000);
//


            //Here is you bill
            System.out.print("\n-----------------------------------|\n");
            System.out.print("|");
            System.out.print("Here is your bill");


//            for(int i=0;i<5;i++){
//                System.out.print(".");
//                Thread.sleep(1000);
//            }
//
//            System.out.print("\n-----------------------------------|\n");
//            Thread.sleep(1000);




            System.out.print("\n----------------------------------------\n");
            System.out.print("|-_-_-_-| ENJOY YOUR FOOD |-_-_-_-_-_-_-|\n");
            System.out.print("----------------------------------------\n\n\n");



            System.out.print("----------------------------------------\n");
            System.out.print("|-----------| TOTAL BILL |-------------|\n");
            System.out.print("----------------------------------------\n");
            System.out.print("|--------------------------------------|\n");
            System.out.print("| Amount Before Discount\t:\t₹"+(total));
            System.out.print("\n|--------------------------------------|\n");
            total = total -dis;
            System.out.print("|--------------------------------------|\n");
            System.out.print("| Amount After Discount\t\t:\t₹"+(total));
            System.out.print("\n|--------------------------------------|\n");
            System.out.print("|--------------------------------------|\n");
            System.out.print("| Discount Amount\t\t\t:\t₹"+dis);
            System.out.print("\n|--------------------------------------|\n");
            double gst= (total*0.18);

            System.out.print("|--------------------------------------|\n");
            System.out.printf("| GST\t\t\t\t\t\t:\t₹"+"%.2f", gst);
            System.out.print("\n|--------------------------------------|\n");
            double famount = gst + total;
            System.out.print("|--------------------------------------|\n");
            System.out.print("| TOTAL\t\t\t\t\t\t:\t₹"+famount);
            System.out.print("\n|--------------------------------------|\n\n\n");

            Menu.options();
        }
        catch(InterruptedException ex){

            ex.printStackTrace();
        }


    }

    }