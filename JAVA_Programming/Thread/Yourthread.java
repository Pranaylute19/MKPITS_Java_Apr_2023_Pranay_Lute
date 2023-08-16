package Threads;

public class Yourthread implements Runnable{
    public void run(){
    while(true) {
        System.out.println("hello" + Thread.currentThread().getName());
    }
    }
}
