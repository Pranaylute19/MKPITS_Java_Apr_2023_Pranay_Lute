class SandGlassStarPatternDown{
	public int starpattern(int number1){
	    for (int row = 1; row <= number1; row++) {
            for (int column = 1; column <= number1-row; column++) {
                System.out.print(" ");
            }
            for (int starcolumn = 1; starcolumn <= 2 * row - 1; starcolumn++) {
                System.out.print("*");
            }
            System.out.println();
        }
		
      return 0; 
}
}