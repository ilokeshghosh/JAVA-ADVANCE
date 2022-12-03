package OOPs;
class StudenT{
    String name;
    static String school;
    public static void changeSchool(){
        school="newshool";
    }

}
public class Static_keywords {
    public static void main(String[] args){
        StudenT.school="LMET International School";
        System.out.println(StudenT.school);


        StudenT student1=new StudenT();
        student1.name="Lokesh Ghosh";


    }
}
