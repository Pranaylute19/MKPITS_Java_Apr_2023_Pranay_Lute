class MainOR{
	public static void main(String[] args){
	
		logicalOR logicalOperator1 = new logicalOR();
		System.out.println("The value of given logical operator using two parameter is : " + logicalOperator1.logicalAndOperator(true,true));
		
	
		logicalOR logicalOperator2 = new logicalOR();
		System.out.println("The value of given logical operator using three parameter is : " + logicalOperator2.logicalAndOperator(true,false,true));
	
	
		logicalOR logicalOperator3 = new logicalOR();
		System.out.println("The value of given logical operator using four parameter is : " + logicalOperator3.logicalAndOperator(true,false,true,false));
		
	
		logicalOR logicalOperator4 = new logicalOR();
		System.out.println("The value of given logical operator using five parameter is : " + logicalOperator4.logicalAndOperator(true,true,false,false,true));
	}
}