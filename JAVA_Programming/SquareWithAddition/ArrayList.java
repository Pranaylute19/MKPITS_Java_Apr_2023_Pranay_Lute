public class ArrayList implements ArraylistAddition{
	public void ArrayListMethod(){
		int arr[]={1,2,3,4,5,7,8,9,0,8,7,6,5,4,3,2,5,2,3,4,5,6,7,8,8,899,7,5,4,333,3,3,2,2,334,4,5,56,6,667,77};
		int sum=0;
		for(int counter=0;counter<=arr.length;counter=counter+4){
		 sum=sum+(arr[counter]*arr[counter]);
		
	}
	System.out.print(sum);
	}
	}
		