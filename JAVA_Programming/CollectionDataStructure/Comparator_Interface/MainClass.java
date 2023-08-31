package Comparator_Interface;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class MainClass {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList<>();
        Student []students=new Student[4];
        students[0]=new Student(99,"prny");
        students[1]=new Student(88,"abhi");
        students[2]=new Student(87,"teja");
        students[3]=new Student(44,"shubh");

        System.out.println("This is for Student marks sort");
        linkedList.addAll(Arrays.asList(students));
        Collections.sort(linkedList);
        Collections.sort(linkedList,new StudentMarks());
        for (Object obj:linkedList
             ) {
            System.out.println(obj);
        }
        System.out.println("---------------------------------------------------");

        System.out.println("This is for Student Name sort");
        Collections.sort(linkedList,new Name());

        for (Object obj1:linkedList
             ) {
            System.out.println(obj1);
        }
    }
}
