package LambdaExpressionOfShape;

import org.w3c.dom.UserDataHandler;

import java.util.Scanner;

public class Circle {
    public static void main(String[]arg) {
        System.out.println("1-for Square : \n 2- for Rectangle : ");
        Scanner sc = new Scanner(System.in);
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
            Shape shape = (height,width) ->
                    System.out.println("Area of Square "+(height*width));
            shape.calArea(12,12);
            break;
            case 2:
            Shape shape1 = (int length,int bredth) ->
                    System.out.println("Area of Rectangle "+(length*bredth));
            shape1.calArea(13,11);
            break;
        }
    }

}
