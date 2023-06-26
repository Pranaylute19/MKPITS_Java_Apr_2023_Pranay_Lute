class Password{
	public static void main(String[]args){
		int pass=123;
		do{
			if(pass==123){
				System.out.println("Correct Password");
			}
			else{
				System.out.println("Enter your Correct Password");
				break;
			}
		}
		while(pass<=123);
			
	}
}