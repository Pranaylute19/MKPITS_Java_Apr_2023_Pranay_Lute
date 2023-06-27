import java.util.Scanner;
public class MainStarPattern {

    public static void main(String[] args) {
        int num = 10;
        while (num == 10) {

            
            Scanner scanner = new Scanner(System.in);
            int pattern = scanner.nextInt();
            System.out.println("Enter the number for star pattern Design : ");
            int number = scanner.nextInt();

            ServicePattern servicePattern = new ServicePattern();
            servicePattern.serviceStarPattern(pattern, number);
            
        }
    }
}