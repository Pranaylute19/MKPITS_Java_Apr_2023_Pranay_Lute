import java.util.Hashtable;

public class HashTableProgram {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable=new Hashtable();
        hashtable.put(1,"pranay");
        hashtable.put(2,"abhi");
        hashtable.put(3,"rajjo");
        System.out.println(hashtable);
       String s= hashtable.get(1);
        System.out.println(s);
    }
}
