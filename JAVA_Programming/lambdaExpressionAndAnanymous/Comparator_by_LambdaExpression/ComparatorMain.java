package Comparator_by_LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorMain {
    public static void main(String[] args) {
        ArrayList <StudentClass> arrayList = new ArrayList<StudentClass>();
        arrayList.add(new StudentClass("abhi",45));
        arrayList.add(new StudentClass("pranay",87));
        arrayList.add(new StudentClass("Ashish",77));

        Comparator<StudentClass> student = (Object1, Object2)->{
            if (Object1.getMarks()==Object2.getMarks()){
                return 0;
            } else if (Object1.getMarks()<Object2.getMarks()) {
                return -1;

            }
            else
                return 1;

        };
        System.out.println(arrayList);


        Comparator<StudentClass> studentClassComparator=(Object1, Object2)->{
            return Object1.getName().compareTo(Object2.getName());
        };
        Collections.sort(arrayList,studentClassComparator);
        System.out.println(arrayList);
    }
}