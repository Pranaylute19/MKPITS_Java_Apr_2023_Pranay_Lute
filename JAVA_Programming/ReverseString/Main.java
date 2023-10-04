import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("1 - Insert the data \n 2- display the data");
        Scanner sc =new Scanner(System.in);


        int count=sc.nextInt();


            switch (count){

            case 1:
                Database.insertData("Abhi","Dangore","nanded");
                break;

            case 2:
                Database.displayData();


        }


    }
    }
