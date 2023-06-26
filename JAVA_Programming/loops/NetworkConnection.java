class NetworkConnection{
	
	public static void main(String[]args){
	boolean dataConnection=false;
	 do{
		 if(dataConnection){
		    System.out.println("Data connection Succesfully");
		   }
		else{
			System.out.println("Waiting for the Data Connection");
			
		  }
		}
		while(!dataConnection);
		
	}
}