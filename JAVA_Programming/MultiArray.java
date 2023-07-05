class MultiArray{
	public static void main(String[]args){
		int arr[][]={   {2,3,4,5,6},
						{3,7,6,9,1},
						{9,8,3,4,5},
						{5,3,4,5,5},
						{7,5,6,3,4}};
						
				for(int row=0;row<5;row++){
						for(int column=0;column<5;column++){
							System.out.println("Array["+row+"]["+column+"]value :-"+ arr[row][column]);
						}
				}
	}
}