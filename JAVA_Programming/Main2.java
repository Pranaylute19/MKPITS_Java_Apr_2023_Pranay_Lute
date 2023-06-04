public class Main2{
	public static void main(String []args){
		ArithmaticSubstraction substract=new ArithmaticSubstraction();
			System.out.println("substract:"+ (substract.SubstractionInt(12,13)));
			
		ArithmaticSubstraction substract1=new ArithmaticSubstraction();	
			System.out.println("substract:"+(substract1.Substractionfloat(12.98f,11.11f)));
			
			
		ArithmaticSubstraction substract2=new ArithmaticSubstraction();
		     System.out.println("Substract:"+(substract2.Substractiondouble(12.9999d,56.7777d)));
			 
		ArithmaticSubstraction substract3=new ArithmaticSubstraction();	 
			System.out.println("substract:"+(substract3.SubstractionLong(6666666l,888888l)));
			}
}