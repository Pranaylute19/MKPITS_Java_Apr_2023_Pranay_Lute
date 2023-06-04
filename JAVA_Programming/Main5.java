public class Main5{
	public static void main(String []args){
		LogicalOperator logical=new LogicalOperator();
		int num1=50;
		int num2=40;
		int num3=50;
		int num4=10;
		boolean bool1=num1>num2;
		boolean bool2=num3>num4;
		System.out.println("output :"+(logical.logicalop(bool1,bool2)));
		
		LogicalOperator logicalOR=new LogicalOperator();
	    int num5=50;
		int num6=40;
		int num7=20;
		int num8=30;
		 boolean bool11=num6>num5;
		boolean bool22=num7>num8;
		System.out.println("output :"+(logicalOR.logicalOpOR(bool11,bool22)));
	}
}
	