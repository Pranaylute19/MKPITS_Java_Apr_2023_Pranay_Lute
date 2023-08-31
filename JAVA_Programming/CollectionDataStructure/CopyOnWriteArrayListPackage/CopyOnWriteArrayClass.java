package CopyOnWriteArrayListPackage;

import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayClass {
    public static void main(String[] args) {
        CopyOnWriteArrayList copyOnWriteArrayList=new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add("Pranay");
        copyOnWriteArrayList.add("bheja");
        copyOnWriteArrayList.add("teja");
        copyOnWriteArrayList.add("abhi");

        LinkedList list=new LinkedList();
        list.add("ajasvh");
        list.add("sjxsjh");
        list.add("sjd");

        System.out.println(copyOnWriteArrayList);
        System.out.println(copyOnWriteArrayList.contains("abhi"));
        System.out.println(copyOnWriteArrayList.size());
        System.out.println(copyOnWriteArrayList.clone());
        System.out.println(copyOnWriteArrayList.addIfAbsent("rajesh"));
        System.out.println(copyOnWriteArrayList);
        System.out.println(copyOnWriteArrayList.remove(1));
        System.out.println(copyOnWriteArrayList.indexOf("abhi"));
        System.out.println(copyOnWriteArrayList.isEmpty());
        System.out.println(copyOnWriteArrayList.get(1));
        System.out.println(copyOnWriteArrayList.lastIndexOf("Pranay"));
        System.out.println(copyOnWriteArrayList.addAll(1,list));
        System.out.println(copyOnWriteArrayList);
        System.out.println(copyOnWriteArrayList.containsAll(list));
        System.out.println(list);
    }
}
