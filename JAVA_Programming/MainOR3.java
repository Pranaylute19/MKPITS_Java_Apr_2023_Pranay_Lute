class MainOR3{
	public static void main(String[] args){
	
		logicalOR3 logicalOperator1 = new logicalOR3();
		System.out.println("logical operator using two parameter is : " + logicalOperator1.logicalorOperator(true,true,true));
		
	
		logicalOR3 logicalOperator2 = new logicalOR3();
		System.out.println(" operator using three parameter is : " + logicalOperator2.logicalorOperator1(true,true,false));
	
	
		logicalOR3 logicalOperator3 = new logicalOR3();
		System.out.println("operator using four parameter is : " + logicalOperator3.logicalorOperator2(true,false,false));
		
	
		logicalOR3 logicalOperator4 = new logicalOR3();
		System.out.println(" operator using five parameter is : " + logicalOperator4.logicalorOperator3(false,false,true));
		
		logicalOR3 logicalOperator5 = new logicalOR3();
		System.out.println(" operator using five parameter is : " + logicalOperator4.logicalorOperator3(true,false,true));
		
		logicalOR3 logicalOperator5 = new logicalOR3();
		System.out.println(" operator using five parameter is : " + logicalOperator4.logicalorOperator3(false,false,false));
	}
}