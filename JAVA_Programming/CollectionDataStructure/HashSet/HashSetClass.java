package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {
    public static void main(String[] args) {
        HashSet hashSet=new HashSet();
        hashSet.add(20);
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(40);
        hashSet.add(50);

        System.out.println(hashSet.isEmpty());
        System.out.println(hashSet);
        Iterator ite=hashSet.iterator();

        System.out.println(ite);
    }
}
