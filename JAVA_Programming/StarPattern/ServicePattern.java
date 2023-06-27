public class ServicePattern {
public int serviceStarPattern(int pattern,int number){
    switch (pattern){

       
        case 1:

            StarRightAngleUp meargeStarRightAngle=new StarRightAngleUp();
             meargeStarRightAngle.starpattern(number);
            StarRightAngleDown meargeStarInvertedRightAngle =new StarRightAngleDown();
             meargeStarInvertedRightAngle.starpattern(number);
            break;

        case 2:
            
            StarReverseRightAngleTriangle starReverseTriangle=new StarReverseRightAngleTriangle();
            starReverseTriangle.starpattern(number);
            break;
       
        case 3:
            StarRightAngleTriangle RightAngle=new StarRightAngleTriangle();
           int rightAngle= RightAngle.starpattern(number);
           
        
    }
    return 0;
}
}