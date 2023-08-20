package myWaitMethodThread;

public class myMethodWait2 extends Thread{
    public void run(){
        for (int j=0; j<5;j++){
            System.out.println(getName());
        }

    }
}
