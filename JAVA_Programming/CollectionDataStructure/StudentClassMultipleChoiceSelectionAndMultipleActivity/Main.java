package StudentClassMultipleChoiceSelectionAndMultipleActivity;

import UserInput.Student;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Student> linkedList = new LinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice : \n 1:- Add records of Student \n 2:- display the student records \n 3:- Find the Student records \n 4:- Modify the Student records");
        int choice = sc.nextInt();
        switch (choice) {

            case 1:

                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter the Student Name :");
                    String name = scanner.next();

                    System.out.println("Enter the marks : ");
                    int mark = scanner.nextInt();
                    Student student = new Student(mark, name);

                    linkedList.add(student);

            for (Student stud : linkedList) {
                System.out.println(stud.getName() + " " + stud.getMark());}
            case 2:
                Scanner scan =new Scanner (System.in);
        }
    }
}