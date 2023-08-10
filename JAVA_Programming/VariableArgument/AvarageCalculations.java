package VariableArgument;

public class AvarageCalculations {
    public static int Average(int... num){
        int s=0;
        for(int i:num){
             s=(s+i)/2;
        }
        return s;
    }
}
