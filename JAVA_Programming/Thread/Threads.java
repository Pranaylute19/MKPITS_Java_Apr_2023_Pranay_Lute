package Threads;
import Threads.Yourthread;

public class Threads extends Thread{

    public Threads(Yourthread yourthread, String name) {
       super(name);

    }

    public void  run(){
        System.out.println("Hello world"+Thread.currentThread().getName());
//        System.out.println(getName());
    }



}
