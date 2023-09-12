package LambdaExpressionofCalculator;

public class Calculate {
    public static void main(String[]arg){

        Calculation calculation = (num1 ,num2)->
                System.out.println("Addition"+(num1+num2));
                calculation.calculate(12,11);
    }
}
