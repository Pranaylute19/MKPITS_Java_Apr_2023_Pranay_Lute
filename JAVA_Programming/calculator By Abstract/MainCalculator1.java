
public class MainCalculator1 {
    public static void main(String[] args) {
        CalculateServise calculateServise=new CalculateServise();
        calculateServise.calculate("+",10,11);
        calculateServise.calculate("-",18,5);
        calculateServise.calculate("*",15,10);
        calculateServise.calculate("/",15,3);
		calculateServise.calculate("%",15,100);
		
    }
 }
 