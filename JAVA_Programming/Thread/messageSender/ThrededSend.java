package messageSender;

public class ThrededSend extends Thread{
    private String msgs;
    sender sen;


    public ThrededSend(String msg,sender obj) {
        msgs=msg;
        sen=obj;

    }
    public void run(){

//        synchronized (sen) {
            sen.send(msgs);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
//        }



    }
}
