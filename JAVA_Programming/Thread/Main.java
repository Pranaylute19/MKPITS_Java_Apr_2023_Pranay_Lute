import RepetedClassname.mythread;
import Threads.Threads;
import Threads.Yourthread;
import messageSender.ThrededSend;
import messageSender.sender;
import myWaitMethodThread.*;
import myWaitMethodThread.myMethodWait2;

public class Main {
    public static void main(String[] args) throws InterruptedException {


//            Thread t=new Thread(new mythread());
//
//            Thread t1=new Thread(new mythread());
//        t1.start();
//            t.join();
//        t.start();

//        sender obj=new sender();
//        ThrededSend t=new ThrededSend("hello  ",obj);
//        ThrededSend t1=new ThrededSend("byy  ",obj);
//        t.start();
//        t1.start();


//        Thread t1=new Thread(new mymethodWait());
        mymethodWait t = new mymethodWait();
        t.start();

        synchronized (t){
            t.wait();
        }





//        System.out.println("hii");


//        Thread t1=new Thread(new Yourthread(),"Shahrukh");
//        t1.setPriority(1);
//        Thread t=new Thread(new Yourthread(),"Salman");
//        t.setPriority(10);
//        t.getPriority();
//        t1.start();
//    t1.getPriority();
//        t.start();


//        System.out.println(t.getPriority());
//        System.out.println(Thread.activeCount());
//        System.out.println(t.getId());

//        Thread th=new Threads("Salman");
//        th.setName("SRK");
//        th.start();
//        System.out.println(th.getPriority());
//        System.out.println("bye");
//        System.out.println(th.getName());

    }
}
