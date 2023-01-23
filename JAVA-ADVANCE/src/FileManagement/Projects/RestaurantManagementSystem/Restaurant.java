package FileManagement.Projects.RestaurantManagementSystem;

import java.io.Serializable;

public class Restaurant  implements Serializable {
    String fname;
    int price ;

    int fId;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getfId() {
        return fId;
    }

    public void setfId(int fId) {
        this.fId = fId;
    }

    public Restaurant(int fId,String fname, int price) {
        this.fname = fname;
        this.price = price;
        this.fId = fId;
    }


    public Restaurant() {
        super();
    }

//    public void display(){
//        System.out.println("\t\t"+getFname()+"\t\t\t\t₹"+getPrice());
//    }

    public String toString(){
        return fId+" "+fname+" "+price;
    }
}
