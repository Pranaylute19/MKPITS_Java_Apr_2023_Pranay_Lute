class MainAnd{
	public static void main(String[] args){
	
		logical logicalOperator1 = new logical();
		System.out.println(" logical operator using two parameter  : " + logicalOperator1.logicalAndOperator(true,true));
		
	
		logical logicalOperator2 = new logical();
		System.out.println("logical operator using three parameter is : " + logicalOperator2.logicalAndOperator(true,false,true));
	
	
		logical logicalOperator3 = new logical();
		System.out.println(" operator using four parameter is : " + logicalOperator3.logicalAndOperator(true,false,true,false));
		
	
		logical logicalOperator4 = new logical();
		System.out.println(" operator using five parameter is : " + logicalOperator4.logicalAndOperator(true,true,false,false,true));
	}
}