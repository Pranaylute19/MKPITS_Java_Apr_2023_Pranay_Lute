package Comparator_Interface;

import java.util.Comparator;

public class Name implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
    return o1.getName().compareTo(o2.getName());
//        if (o1.getName()==o2.getName()){
//            return 0;
//        }else if (o1.getName() < o2.getName(){
//            return -1;
//        }
//        else {
//            return 1;
//        }
    }
}
