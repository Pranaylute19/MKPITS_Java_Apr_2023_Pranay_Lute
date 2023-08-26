package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListMethods {
    public static void main(String[] args) {

        List list=new LinkedList();
        list.add("pranay");
        list.add("ashish");
        list.add(19.0999);


        System.out.println("******************by for Each-Loop*********************");
        for (Object variable:list) {
            System.out.println("by the use of For-Each loops : "+variable);
        }

        System.out.println("*****************By the for loop :*******************");
        for(int obj=0;obj<list.size();obj++){
            System.out.println("By the use for loop"+list.get(obj));
        }

        System.out.println("***********add(int index, E element)********************");
        list.add(3,"rajabhai");
        for(Object var:list) {

            System.out.println("add method use with two argument : "+var);
        }
        System.out.println("***************addfirst() method use **************");

        LinkedList list1=new LinkedList();
        list1.add("pranay");
        list1.add("ashish");
        list1.add(19.0999);
        list1.addFirst(90);

        System.out.println(list1);
        list1.addLast("abhi");
        System.out.println(list1);


        System.out.println( "get ifrst value :" +list1.getFirst());
        System.out.println(list1.getLast());
        System.out.println(list1.getClass());
        System.out.println(list1.contains("abhi"));
        Object o=list1.poll();
        System.out.println(o);
        System.out.println(list1);
        System.out.println(list1.peek());
        System.out.println(list1);
        System.out.println(list1);
        System.out.println();

    }
}
