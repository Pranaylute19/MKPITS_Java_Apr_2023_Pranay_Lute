import EvenOdd.Even;
import EvenOdd.Odd;
import RandomNumber.RandomNumber;
import RandomNumber.RandomMethod1;

public class Main {
    public static void main(String[] args)  {

//      Thread t1=new Thread(new Even());
//      Thread t2=new Thread(new Odd());
//      t1.start();
//      t2.start();

       Thread t1=new Thread(new RandomNumber());
       Thread t2=new Thread(new RandomMethod1());
       t1.start();
       t2.start();
    }
}