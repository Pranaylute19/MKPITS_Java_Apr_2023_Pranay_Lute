import java.util.Scanner;
public class MainPatternClass{
    public static  void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		
		int number=scanner.nextInt();
		

		
		
		
		PyramidPatternReverse pyramidPatternReverse=new PyramidPatternReverse();
		pyramidPatternReverse.runExample(number);
		
		
		Pyramidpattern1 pyra=new Pyramidpattern1();
		pyra.runExample(number);
		
		StarPatternAssignment5 star=new StarPatternAssignment5();
		star.runExample(number);
		System.out.println(" ");
		
		StarPaternFirstAssignment star1=new StarPaternFirstAssignment();
		star1.runExample(number);
		
		System.out.println(" ");
		Starpattern4 starpattern4=new Starpattern4();
		starpattern4.runExample(number);
		
}}

		





