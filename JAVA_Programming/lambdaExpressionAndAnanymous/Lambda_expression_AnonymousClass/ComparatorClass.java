package Lambda_expression_AnonymousClass;

import java.util.*;

public class ComparatorClass  {
    public static void main(String[] args) {

        ArrayList<Student> arrayList=new ArrayList <Student>();
        arrayList.add(new Student("Pranay",14));
        arrayList.add(new Student("shubh",12));
        arrayList.add(new Student("abhi",13));
        arrayList.addAll(Arrays.asList());
        Collections.sort(arrayList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return 0;
            }
        });
        Iterator iterator=arrayList.iterator();
       if( iterator.hasNext()){
           System.out.println( iterator.next());
       }
    }

    }

