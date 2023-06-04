public class Main1{
	public static void main(String args[]){
		ArithmaticAddition arthmatic =new ArithmaticAddition();
		
		System.out.println("addition:"+ (arthmatic.Additionint(12,15)));
		
		ArithmaticAddition Additionfl=new ArithmaticAddition();
			System.out.println("Addition float:"+ (Additionfl.AdditionFloat(10.88f,1.299f)));
			
			
		ArithmaticAddition Additiondouble=new ArithmaticAddition();	
		
		System.out.println("Addition double"+ (Additiondouble.additionDouble(1.222d,2.333d)));
		
		ArithmaticAddition Additionlong=new ArithmaticAddition();
			System.out.println("Addition long:"+(Additionlong.additionLong(77777777l,8888888l)));

	}
}