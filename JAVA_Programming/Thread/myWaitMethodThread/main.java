package myWaitMethodThread;

public class main {
    public static void main(String[] args) throws InterruptedException {

        mymethodWait t = new mymethodWait();
        t.start();
        synchronized (t){
            t.wait();
        }


    }
}
