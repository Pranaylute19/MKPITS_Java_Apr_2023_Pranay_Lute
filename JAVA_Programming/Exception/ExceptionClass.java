package Exception;

public class ExceptionClass {
    static int i=0;
    public static void display(int factor){
        int number=1;
        
        if(number<factor){
            number=number*factor;
            System.out.println(number);

        }
    }


    public static void main(String[]arhg){
       display((5));
    }
}
