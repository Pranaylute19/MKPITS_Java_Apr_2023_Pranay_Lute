package methodReferenceOfStaticmethodtofunctionlinterface;

public class Main {
    public static void main(String[] args) {
        MyClass myClass=new MyClass();

        //by using method reference
//        MyInterface myInterface=myClass::display;
//        myInterface.disp();


        // By using runnable interface Thread
        Runnable runnable=myClass::display;
        Thread thread=new Thread(runnable);
        thread.start();
    }
}
