package Comparator_by_AnonimousClass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorMain {
    public static void main(String args[]){
        ArrayList <StudentClass>arrayList = new ArrayList<StudentClass>();
        arrayList.add(new StudentClass("abhi",89));
        arrayList.add(new StudentClass("pranay", 91));
        arrayList.add(new StudentClass("Shubham",99));
        System.out.println("-------------------------------------sorting by marks_______________");
        Collections.sort(arrayList, new Comparator<StudentClass>() {
            @Override
            public int compare(StudentClass o1, StudentClass o2) {
                if(o1.getMarks()==o2.getMarks())
                    return 0;
                else if (o1.getMarks()<o2.getMarks()) {
                    return -1;

                }
                else
                    return 1;
            }
        });
        System.out.println(arrayList);

        System.out.println("----------------------------sorting by names---------");
        Collections.sort(arrayList, new Comparator<StudentClass>() {
            @Override
            public int compare(StudentClass o1, StudentClass o2) {
              return  o1.getName().compareTo(o1.getName());
            }
        });
        System.out.println(arrayList);
    }
}
