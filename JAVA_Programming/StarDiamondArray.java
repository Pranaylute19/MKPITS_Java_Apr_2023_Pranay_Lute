import java.util.Arrays;


class StarDiamondArray {	
	
	public  static void main(String[]arg){
		int counter=7/2;
		
		int [][]arr=new int[7][7];
		
		for(int row=0;row<arr.length;row++){
			for(int col=0;col<arr.length;col++){
			if(arr[0][3]==arr[row][col]){
					System.out.print(arr[row][col]);
		}
		System.out.println();
				
	}
  }

	}
	}
