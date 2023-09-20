import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindingMaxAndMinimum {
    public static void main(String[] args) {
//        List <Integer> list= new ArrayList<Integer>();
//        list.add(11);
//        list.add(12);
//        list.add(14);
//        list.add(15);
//        List lst= Arrays.asList(list);
//        List<Integer> int1= (List<Integer>) lst.stream().min(Comparator.comparingInt(list::get)).get();
//        System.out.println(int1);
//    }


        //
        Student student[] = new Student[5];
        student[0]=new Student(11,"pranay");
        student[1]=new Student(12,"Shubh");
        student[2]=new Student(13,"Raj");
        student[3]=new Student(14,"mayur");
        student[4]=new Student(15,"abhi");

        List <Student>students=Arrays.asList(student);

        Student stud=students.stream().max(Comparator.comparingInt(Student::getMarks)).get();
        System.out.println("maximum marks "+stud.getMarks());

        Student stud1=students.stream().min(Comparator.comparingInt(Student::getMarks)).get();
        System.out.println("Minimum marks "+stud1.getMarks());



    }
}