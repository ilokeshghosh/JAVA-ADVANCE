package FileManagement.Projects.RestaurantManagementSystem;

import java.io.*;
import java.util.ArrayList;

public class TotalSale implements  Serializable {
    String fName;
    Double TotalAmount;
    int count;

    static File TotalSaleFile = new File("C:\\Users\\acer\\Desktop\\GIT REPO\\JAVA-ADVANCE\\JAVA-ADVANCE\\src\\FileManagement\\Projects\\RestaurantManagementSystem\\Files\\bill.txt");
//    static ArrayList<TotalSale> TotalSaleList = new ArrayList<TotalSale>();


    static ObjectOutputStream oos= null;
    static ObjectInputStream ois = null;


    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public Double getTotalAmount() {
        return TotalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        TotalAmount = totalAmount;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public TotalSale() {
        super();
    }

    public TotalSale(String fName, int count,Double totalAmount ) {
        this.fName = fName;
        this.TotalAmount = totalAmount;
        this.count = count;
    }

    static void DisplayTotalSale() throws IOException, ClassNotFoundException, InterruptedException {
        ArrayList<TotalSale> TotalSaleList = new ArrayList<TotalSale>();
        if (TotalSaleFile.isFile()){
            ois = new ObjectInputStream(new FileInputStream(TotalSaleFile));
            TotalSaleList = (ArrayList<TotalSale>) ois.readObject();
            ois.close();

            System.out.println("hiiii");
            for(int i=0;i<TotalSaleList.size();i++){
                TotalSale e = (TotalSale) TotalSaleList.get(i);

                System.out.println(e.fName+" "+e.count+" "+e.TotalAmount);
            }
        }else {
            System.out.print("\n-----------------------------------|\n");
            System.out.print("|");
            System.out.print("File Not Exist......!!");
            System.out.print("\n-----------------------------------|\n\n\n");
            Thread.sleep(1000);
        }
    }
}
