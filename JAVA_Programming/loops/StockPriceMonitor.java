public class StockPriceMonitor {
    public static void main(String[] args) {
        double currentPrice = 150;  

        while (true) {
          
           // System.out.println("Current stock price:" + currentPrice);
            if (currentPrice > 150) {
                System.out.println("Stock price is too high");
                
            } else if (currentPrice < 80) {
                System.out.println("Stock price is too low");
                
            }
		}
	}
}