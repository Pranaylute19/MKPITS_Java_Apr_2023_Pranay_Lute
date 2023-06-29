class SandGlassStarPatternUp{
	public int starpattern(int number1){
	    for (int m=number1-1; m>=1; m--){
           for (int n=number1-1; n>=m; n--){
             System.out.print(" ");
                }
            for (int p=1; p<=(m * 2) -1; p++){
             System.out.print("*");
                }
         System.out.println();
       }return 0;
}
}