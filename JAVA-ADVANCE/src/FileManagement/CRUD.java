package FileManagement;
import java.io.*;
import java.util.*;
class Employee implements Serializable {
    int empNo;
    String empName;
    int salary;
    Employee(int empNo, String empName,int salary)
    {
        this.empNo=empNo;
        this.empName=empName;
        this.salary=salary;
    }
    public String toString(){
        return empNo+" "+empName+" "+salary;
    }
}
public class CRUD {
    public static void main(String[] args) throws Exception{
        Scanner sc= new Scanner(System.in);
        Scanner sc1= new Scanner(System.in);
        File file= new File("Employee.txt");
        ArrayList<Employee> al = new ArrayList<Employee>();
        ObjectOutputStream oos= null;
        ObjectInputStream ois = null;
        int empNo=0;

        ListIterator li=null;
            if(file.isFile()){
                ois = new ObjectInputStream(new FileInputStream(file));
                al=(ArrayList<Employee>)ois.readObject();
                ois.close();
            }
        int choice=-1;
        do {
            System.out.println("1.Insert");
            System.out.println("2.Display");
            System.out.println("3.Search");
            System.out.println("4.Delete");
            System.out.println("0. Exit");
            System.out.println("Enter you choice");
            choice= sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter how many employees you want : ");
                    int n=sc.nextInt();
                    for(int i=0;i<n;i++){
                        System.out.print("Enter Employee No: ");
                        empNo= sc.nextInt();

                        System.out.print("Enter Employee Name: ");
                        String empName= sc1.nextLine();

                        System.out.print("Enter Employee Salary: ");
                        int Salary= sc.nextInt();

                        al.add(new Employee(empNo, empName, Salary));
                    }
                        oos = new ObjectOutputStream(new FileOutputStream(file));
                        oos.writeObject(al);
                        oos.close();

                        break;
                case 2:
                    if(file.isFile()){
                        ois = new ObjectInputStream(new FileInputStream(file));
                        al=(ArrayList<Employee>)ois.readObject();
                        ois.close();
                        System.out.println("----------------------------------------");
                        System.out.println("Emp-id Emp-Name Emp-salary");
                        li= al.listIterator();
                        while (li.hasNext()){
                            System.out.println(li.next());
                        }
                        System.out.println("----------------------------------------");
                    }else {
                        System.out.println("File Not Exist......!!");
                    }

                    break;

                case 3:
                    if(file.isFile()){
                        ois = new ObjectInputStream(new FileInputStream(file));
                        al=(ArrayList<Employee>)ois.readObject();
                        ois.close();
                        boolean found=false;
                        System.out.println("Enter Employee Number to Search");
                        empNo = sc.nextInt();
                        System.out.println("----------------------------------------");
                        System.out.println("Emp-id Emp-Name Emp-salary");
                        li= al.listIterator();
                        while (li.hasNext()){

                            Employee e= (Employee) li.next();
                            if(e.empNo == empNo){
                                System.out.println(e);
                                found = true;
                            }


                        }
                        if(!found){
                            System.out.println("Record Not Found......!");
                        }
                        System.out.println("----------------------------------------");
                    }
                    else {
                        System.out.println("File Not Exist......!!");
                    }


                    break;
            }
        }while (choice !=0);
    }
}