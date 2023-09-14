package ConstructorReferenceOfStaticmethodtofunctionlinterface;

public class Main {
    public static void main(String[] args) {
        YourInterface yourInterface=Student::new;
        Student student=yourInterface.getStud(11,"shsh");

        System.out.println( student.getMarks());
        System.out.println(student.getName());

    }
}
