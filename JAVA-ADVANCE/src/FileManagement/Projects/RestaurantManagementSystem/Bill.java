package FileManagement.Projects.RestaurantManagementSystem;

public class Bill {
    String fname;
    int qty;
    double amt;

    public String getFname(){
        return fname;
    }

    public void setFname(String fname){
        this.fname=fname;
    }

    public int getQty(){
        return qty;
    }

    public void setQty(int qty){
        this.qty=qty;
    }

    public double getAmt(){
        return amt;
    }

    public Bill(String fname, int qty, double amt){
        super();
        this.fname=fname;
        this.qty= qty;
        this.amt=amt;

    }
    public Bill(){
        super();
    }
}
