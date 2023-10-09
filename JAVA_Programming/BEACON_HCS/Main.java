// patient age below than 17 of doctor fee is 300
// & patient age greater than 17 and below 40 of doctor fee is 200
// & patient age greater than 40 and doctor fee is 400
// & addition of doctor daily collection maximum daily patient is 10




import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int feesForBelowAgeOf_17 = 300;
        int feesBetweenAgeOf17To40 = 400;
        int feesForAgeAbove_40 =200;
        int totalFeesOfTheDay=0;

        int[] age=new int[10];

        Scanner scanner = new Scanner(System.in);


        for (int counter=0;counter<age.length;counter++){
            System.out.println("Enter age for patient "+counter+ " = ");
            int PatientAge=scanner.nextInt();

            if (PatientAge<=17){
                System.out.println("fee : 300");
                totalFeesOfTheDay+=feesForBelowAgeOf_17;
            }if (PatientAge>=17 && PatientAge<=40){
                System.out.println("fee : 400");
                totalFeesOfTheDay+=feesBetweenAgeOf17To40;
            }if (PatientAge>40){
                System.out.println("fee : 200");
                totalFeesOfTheDay+=feesForAgeAbove_40;
            }
            if(PatientAge>=120 ){
                System.out.println("Invalid age input");
            }
        }
        System.out.println("Total earning of the day = "+totalFeesOfTheDay);
    }
}