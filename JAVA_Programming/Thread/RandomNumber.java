package RandomNumber;

public class RandomNumber implements Runnable {
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("1 :"+Math.random());
        }
    }
}
