public class Course {

    private String courseName;
    private int credits;
    private double grade;

    public Course(String courseName, int credits) {
        this.courseName = courseName;
        this.credits = credits;
        this.grade = 0.0;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCredits() {
        return credits;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Course{" +
                "Coursename='" + courseName + '\'' +
                ", credithour=" + credits +
                ", grade=" + grade +
                '}';
    }
}
