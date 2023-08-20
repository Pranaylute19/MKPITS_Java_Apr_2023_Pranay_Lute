package messageSender;

public class sender {
    public synchronized void send(String msg){
        System.out.println("Sending  "+msg);
        System.out.println("send  "+msg);

    }
}
