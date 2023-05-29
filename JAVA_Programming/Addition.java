class Addition{

	
	public int addInt(int number1 , int number2){
		return number1+number2;
		}
}		
	class Add{
		public static void main(String[] args){
			int ans;
		
			Addition addn =new Addition();
			ans = addn.addInt(15,16);
			System.out.println(ans);
		 
}
}
