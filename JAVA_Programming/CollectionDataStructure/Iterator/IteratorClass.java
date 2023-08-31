package Iterator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class IteratorClass {
    public static void main(String[] args) {

        List list=new LinkedList();
        list.add("prny");
        list.add("Abhi");
        list.add("teju");

        ListIterator listIterate=list.listIterator();


        System.out.println("_--------Directional--AND Bidirectional ----");
      while (listIterate.hasNext()){
          System.out.println(listIterate.next());
      }
      while (listIterate.hasPrevious()){

          System.out.println(listIterate.previous());
      }


    }
}


