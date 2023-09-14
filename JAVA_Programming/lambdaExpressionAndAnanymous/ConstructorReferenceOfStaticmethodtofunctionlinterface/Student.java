package ConstructorReferenceOfStaticmethodtofunctionlinterface;

public class Student {
    private int marks;
    private String name;

    public Student(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }
//    public Student(){
//
//    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }
}