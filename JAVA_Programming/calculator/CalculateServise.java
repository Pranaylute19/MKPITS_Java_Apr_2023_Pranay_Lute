public class CalculateServise {
    
    public void calculate(String Operetor ,double operend1 ,double operend2 ){

        switch (Operetor){

            case"+":
                CalculateAdd calculateAdd = new CalculateAdd();
                System.out.println(operend1+" + "+operend2+" ="+ calculateAdd.getCalculatevalue(operend1,operend2));

                break;
            case "-":
                CalculateSubstraction calculateSubstraction = new CalculateSubstraction();
			   System.out.println(operend1+" - "+ operend2+"="+ calculateSubstraction.getCalculatevalue(operend1,operend2));

                break;
            case "*":
                CalculateMulTiply calculateMulTiply = new CalculateMulTiply();
				 System.out.println(operend1+" * "+ operend2+"="+ calculateMulTiply.getCalculatevalue(operend1,operend2));

                break;
            case "/":
                CalculateDivision calculateDivision = new CalculateDivision();
				System.out.println(operend1+" / "+ operend2+"="+ calculateDivision.getCalculatevalue(operend1,operend2));
				break;
				
			case "%":
				CalculateModulous calculateModulous=new CalculateModulous();
				System.out.println(calculateModulous.getCalculatevalue(operend1,operend2));
				break;
        }
    }
}
