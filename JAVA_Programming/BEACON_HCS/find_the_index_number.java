import java.util.Scanner;

public class find_the_index_number {
    public static void main(String[] args) {
        Scanner  scanner=new Scanner(System.in);
        System.out.println("Enter the index ");
        int index=scanner.nextInt();
        int number=(index*10)+2;
        System.out.println("The index number is " +index+" and value  is "+number);
    }
}
