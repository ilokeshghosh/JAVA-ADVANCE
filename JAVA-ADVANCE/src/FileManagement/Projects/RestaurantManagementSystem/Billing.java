package FileManagement.Projects.RestaurantManagementSystem;


import java.util.*;
import java.io.*;

//path : C:\Users\acer\Desktop\GIT REPO\JAVA-ADVANCE\JAVA-ADVANCE\src\FileManagement\Projects\RestaurantManagementSystem\Files
public class Billing {




    static ArrayList<Bill>  list = new ArrayList<Bill>();
    static String  coupon = "A12Z";
    static Scanner sc = new Scanner(System.in);
   static Scanner sc1= new Scanner(System.in); // For String Input

    static ListIterator li=null;



    static void order(String fname, int amt) {
        System.out.print("\n-----------------------------------|\n");
        System.out.print("|");
        System.out.print("Enter the quantity for "+fname+" : ");
        System.out.print("\n-----------------------------------|\n");
        System.out.print("|");
        System.out.print("Enter Input : ");
        int qty = sc.nextInt();
        System.out.print("-----------------------------------|\n\n\n");


//        System.out.println("Enter the quantity for "+fname+" : ");
//        int qty = sc.nextInt();


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


//        System.out.println("Do you want to continue : y/n");
//        char ch = sc.next().charAt(0);


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

//            System.out.println("Do you have coupon : y/n");
//            char ch2 = sc.next().charAt(0);


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

    static void totalbill(int dis) {
        System.out.println();

        System.out.print("-------------------------------------------------------------------------------------------------------------\n");
        System.out.print("|----------------------------------| CHECK-OUT AND ORDER SUMMARY |-------------------------------------------|\n");
        System.out.print("-------------------------------------------------------------------------------------------------------------\n");
        System.out.print("|------------------------------------------------------------------------------------------------------------|\n");
        System.out.print("|  ITEMS  |"+"\t\t\t\t\t\t\t\t"+"|  QUANTITY  |"+"\t\t\t\t\t\t\t\t\t  "+"|  AMOUNT  |"+" \t \t |");
        System.out.print("\n|------------------------------------------------------------------------------------------------------------|\n");


        double total=0.0;

        for(Bill b: list) {
            System.out.println("| \t"+b.fname+"\t\t\t\t\t\t\t\t\t\t"+b.qty+" \t\t\t\t\t\t\t\t\t\t\t₹"+b.amt+"    \t \t | ");
            System.out.print("|------------------------------------------------------------------------------------------------------------|\n");

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
            System.out.print(".");
            Thread.sleep(1000);

            System.out.print(".");
            Thread.sleep(1000);

            System.out.print(".");
            Thread.sleep(1000);

            System.out.print(".");
            Thread.sleep(1000);

            System.out.print(".");
            Thread.sleep(1000);

            System.out.print(".");
            Thread.sleep(1000);

            System.out.print(".");
            Thread.sleep(1000);

            System.out.print("Done");
            Thread.sleep(1000);

            System.out.print("\n-----------------------------------|\n");
            Thread.sleep(1000);


            //Packing food
            System.out.print("\n-----------------------------------|\n");
            System.out.print("|");
            System.out.print("Packing your food");
            System.out.print(".");
            Thread.sleep(1000);

            System.out.print(".");
            Thread.sleep(1000);

            System.out.print(".");
            Thread.sleep(1000);

            System.out.print(".");
            Thread.sleep(1000);

            System.out.print(".");
            Thread.sleep(1000);

            System.out.print(".");
            Thread.sleep(1000);

            System.out.print(".");
            Thread.sleep(1000);

            System.out.print("Done");
            Thread.sleep(1000);

            System.out.print("\n-----------------------------------|\n");
            Thread.sleep(1000);


            //Making Bill
            System.out.print("\n-----------------------------------|\n");
            System.out.print("|");
            System.out.print("Making Bill");
            System.out.print(".");
            Thread.sleep(1000);

            System.out.print(".");
            Thread.sleep(1000);

            System.out.print(".");
            Thread.sleep(1000);

            System.out.print(".");
            Thread.sleep(1000);

            System.out.print(".");
            Thread.sleep(1000);

            System.out.print(".");
            Thread.sleep(1000);

            System.out.print(".");
            Thread.sleep(1000);

            System.out.print("Done");
            Thread.sleep(1000);

            System.out.print("\n-----------------------------------|\n");
            Thread.sleep(1000);



            //Here Is your order
            System.out.print("\n-----------------------------------|\n");
            System.out.print("|");
            System.out.print("Here is your order");
            System.out.print(".");
            Thread.sleep(1000);

            System.out.print(".");
            Thread.sleep(1000);

            System.out.print(".");
            Thread.sleep(1000);

            System.out.print(".");
            Thread.sleep(1000);

            System.out.print(".");
            Thread.sleep(1000);

            System.out.print(".");
            Thread.sleep(1000);

            System.out.print(".");
            Thread.sleep(1000);

//            System.out.print("Done");
//            Thread.sleep(1000);

            System.out.print("\n-----------------------------------|\n");
            Thread.sleep(1000);



            //Here is you bill
            System.out.print("\n-----------------------------------|\n");
            System.out.print("|");
            System.out.print("Here is your bill");
            System.out.print(".");
            Thread.sleep(1000);

            System.out.print(".");
            Thread.sleep(1000);

            System.out.print(".");
            Thread.sleep(1000);

            System.out.print(".");
            Thread.sleep(1000);

            System.out.print(".");
            Thread.sleep(1000);

            System.out.print(".");
            Thread.sleep(1000);

            System.out.print(".");
            Thread.sleep(1000);

            System.out.print("\n-----------------------------------|\n");
            Thread.sleep(1000);




            System.out.print("\n----------------------------------------\n");
            System.out.print("|-_-_-_-| ENJOY YOUR FOOD |-_-_-_-_-_-_-|\n");
            System.out.print("----------------------------------------\n\n\n");


//            System.out.println();
//            System.out.println("TOTAL BILL");
//            System.out.println("=======");
//            System.out.println("Amount Before Discount : ");
//            System.out.println("Amount  ₹"+(total));
//            total = total -dis;
//            System.out.println("Amount After Discount : ");
//            System.out.println("Amount  ₹"+(total));
//            System.out.println("Discount Amount : ₹"+dis);
//            double gst = total*0.05;
//            System.out.println("GST : ₹"+gst );
//            System.out.println("--------------");
//            double famount = gst + total;
//            System.out.println("Total : ₹"+famount);

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
            System.out.print("\n|--------------------------------------|\n");


        }
        catch(InterruptedException ex){
            //  System.out.println("Hi Hello!");
            ex.printStackTrace();
        }


    }

    }