package MultiThreading;
public class test {
    public static void main(String[] args) {
        //Declare three Variables and initialise them with some valid values. One of type int, one of type byte and one of type
// short. Finally, create a variable of type long which is equal to 1000 times the sum of the above three.


        int a = 10;
        byte b = 126;
        short c = 32767;
        long d = 1000 * (a + b + c); // 32903000
        short e = (short) d;
        System.out.println("long 1 : " + d);
        System.out.println("short 2 : " + e);


        int f = 5;
        byte g = 2;
        short h = 5;
        long i = 1000 * (f + g + h); // 120000
        short j = (short) i;
        System.out.println("long 2 : " + i);
        System.out.println("short 2 " + i);


        short z=3290;
        System.out.println((int)(z));
        long vIn = 32767;
        short vOut = (short)vIn;
        System.out.println(vOut);





    }
}
