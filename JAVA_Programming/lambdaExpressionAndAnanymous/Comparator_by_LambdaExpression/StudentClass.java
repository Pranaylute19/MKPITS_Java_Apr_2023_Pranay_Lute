package Comparator_by_LambdaExpression;

public class StudentClass {
    private String name;
    private int marks;


    public StudentClass (String name, int marks){
        this.name= name;
        this.marks=marks;
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "StudentClass{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public int getMarks(){
        return marks;

    }
}
