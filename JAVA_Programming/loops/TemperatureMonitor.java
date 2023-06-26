public class TemperatureMonitor {
    public static void main(String[] args) {
        double currentTemperature = 10.0;  
        while (true) {

            System.out.println("Current temperature: " + currentTemperature + "C");

            if (currentTemperature > 30.0) {
                System.out.println("Temperature is too high!");
                
            } else if (currentTemperature < 15.0) {
                System.out.println("Temperature is too low!");
               
            }

        }
    }
}	