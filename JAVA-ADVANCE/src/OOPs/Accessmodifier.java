package OOPs;
class Account{
    public String name;
    protected String email;
    private String password;


    //Private element can be accessed my using getters and setters functions
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String pass){
         this.password=pass;

    }
}
public class Accessmodifier {
    public static void main(String[] args){
        Account account1=new Account();
        account1.name="Lokesh Ghosh";
        account1.email="ghoshlokesh57@gmail.com";
//        account1.password="lokesh4994";

        account1.setPassword("lokesh4994");
        System.out.println(account1.getPassword());

    }
}
