package EvenOdd;

public class Odd implements Runnable{
        public void run(){
            for(int i=0;i<100;i++){
                if(i%2!=0){
                    System.out.println("odd :"+i);
                }
            }
        }
}
