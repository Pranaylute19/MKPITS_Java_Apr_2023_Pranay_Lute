public class ServicePattern {
public int serviceStarPattern(int pattern,int number){
    switch (pattern){


		case 1:
			DiamondPatternUp diamond=new DiamondPatternUp();
			diamond.starpattern(number);
			DiamondPatternDown diamondPatternDown=new DiamondPatternDown();
			diamondPatternDown.starpattern(number);
		   break;
		   
		 case 2:
            
            StarReverseRightAngleTriangle starReverseTriangle=new StarReverseRightAngleTriangle();
            starReverseTriangle.starpattern(number);
            break; 

		case 3:
            StarRightAngleTriangle RightAngle=new StarRightAngleTriangle();
           int rightAngle= RightAngle.starpattern(number);
           return rightAngle;
		   
       
        case 4:

            StarRightAngleUp meargeStarRightAngle=new StarRightAngleUp();
             meargeStarRightAngle.starpattern(number);
            StarRightAngleDown meargeStarInvertedRightAngle =new StarRightAngleDown();
             meargeStarInvertedRightAngle.starpattern(number);
            break;
			
		case 5	:
		SandGlassStarPatternUp sandGlassStarPatternUp=new SandGlassStarPatternUp();
		sandGlassStarPatternUp.starpattern(number);
		SandGlassStarPatternDown sandGlassStarPatternDown=new SandGlassStarPatternDown();
		sandGlassStarPatternDown.starpattern(number);
		
		break;
		
	
    }
    return 0;
}
}