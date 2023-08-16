package EvenOdd;

import java.beans.Expression;

public class Even implements Runnable {
    public void run() {

            for (int i = 0; i < 100; i++) {
                if (i % 2 == 0) {
                    System.out.println("Even :" + i);
                    try{
                        Thread.sleep(500);
                    }catch(InterruptedException e){
                        throw new RuntimeException(e);
                    }
                }
            }
           }
    }
