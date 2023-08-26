import UserInput.Student;

import java.util.LinkedList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        LinkedList <Student> linkedList=new LinkedList();

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the marks :");
        int marks =scanner.nextInt();
        String name=  scanner.next();
        Student student=new Student(marks,name);

        linkedList.add(student);
        for(Student student1:linkedList){
            System.out.println(student1.getMark()+" "+student1.getName());
        }
    }
}