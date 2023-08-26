package CollectionsMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class JavaColelctionmethod {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList();
        list.add(90);
        list.add(80);
        list.add(10);
        list.add(20);
        System.out.println(list);

        System.out.println("Using for loop ");
        for(int element=0;element<list.size();element++){
            System.out.println(list.get(element));
        }
        System.out.println("using for each loop");
        for (Integer number: list) {
            System.out.println(number);
        }


    }
}
