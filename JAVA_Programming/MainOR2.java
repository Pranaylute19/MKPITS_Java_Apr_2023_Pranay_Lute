class MainOR2{
	public static void main(String[] args){
	
		logicalOR2 logicalOperator1 = new logicalOR2();
		System.out.println("logical operator using two parameter is : " + logicalOperator1.logicalAndOperator(true,true));
		
	
		logicalOR2 logicalOperator2 = new logicalOR2();
		System.out.println(" operator using three parameter is : " + logicalOperator2.logicalAndOperator(true,false));
	
	
		logicalOR2 logicalOperator3 = new logicalOR2();
		System.out.println("operator using four parameter is : " + logicalOperator3.logicalAndOperator(false,true));
		
	
		logicalOR2 logicalOperator4 = new logicalOR2();
		System.out.println(" operator using five parameter is : " + logicalOperator4.logicalAndOperator(false,false));
	}
}