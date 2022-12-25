package MultiThreading;
class MyThread1 extends Thread{

    @Override
    public void run(){
        int i=0;
        while(i<4000){
            System.out.println("This is Thread-1 and it is running for COOKING");
            System.out.println("I am happy for Thread-1");
            i++;

        }

    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<4000){
            System.out.println("This is Thread-2 and it is running for CHATTING");
            System.out.println("I am happy for Thread-2");
            i++;
        }

    }
}

public class Creating_Thread_Extenting_thread_class {
    public static void main(String[] args){
        MyThread1 t1=new MyThread1();
        MyThread2 t2=new MyThread2();
        t1.start();
        t2.start();
    }
}
