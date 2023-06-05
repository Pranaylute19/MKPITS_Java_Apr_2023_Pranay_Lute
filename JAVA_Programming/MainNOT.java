class MainNOT{
	public static void main(String[] args){
	
		logicalNOT logicalOp1 = new logicalNOT();
		System.out.println("logical operator using two parameter is : " + logicalOp1.logicalAndOperator(true,true));
		
	
		logicalNOT logicalOp2 = new logicalNOT();
		System.out.println("  logical operator using three parameter is : " + logicalOp2.logicalAndOperator(true,false,true));
	
	
		logicalNOT logicalOp3 = new logicalNOT();
		System.out.println(" logical operator using four parameter is : " + logicalOp3.logicalAndOperator(true,false,true,false));
		
	
		logicalNOT logicalOp4 = new logicalNOT();
		System.out.println("logical operator using five parameter is : " + logicalOp4.logicalAndOperator(true,true,false,false,true));
	}
}