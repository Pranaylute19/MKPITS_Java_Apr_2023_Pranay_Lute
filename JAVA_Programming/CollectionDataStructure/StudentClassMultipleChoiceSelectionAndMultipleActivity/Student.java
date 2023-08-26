package StudentClassMultipleChoiceSelectionAndMultipleActivity;

public class Student {
    private int marks;
    private String name;

    public Student( String name,int marks) {
        this.marks = marks;
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }
}
