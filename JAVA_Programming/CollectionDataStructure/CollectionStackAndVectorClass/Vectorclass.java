package QueueCollection;


import java.util.Vector;

public class Vectorclass {
    public static void main(String[]arg){

        Vector vector1=new Vector();
        vector1.add("pranay");
        vector1.add("neha");
        vector1.add("111");
        vector1.add("888");
        vector1.add("pranay");
        vector1.add("neha");
        vector1.add("111");
        vector1.add("888");
        vector1.add("pranay");
        vector1.add("neha");
        vector1.add("neha");
        System.out.println("raj");

        System.out.println(vector1);
        System.out.println(vector1);
        System.out.println(vector1.contains("neha"));
        System.out.println(vector1.get(0));
        System.out.println(vector1.clone());
        System.out.println(vector1.elementAt(1));
        System.out.println(vector1.capacity());
        System.out.println(vector1.firstElement());
        vector1.add(1,"bahubali");
        System.out.println(vector1);
        String str[] = new String[vector1.size()];
        vector1.copyInto(str);
        System.out.println(vector1);
        System.out.println(vector1.lastElement());
        
    }
}
