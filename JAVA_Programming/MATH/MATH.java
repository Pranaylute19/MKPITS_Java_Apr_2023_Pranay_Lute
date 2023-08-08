package MATH;

public class MATH {
    public static void main(String[]arg){
        double x=2.6;
        int y=6;
        double num1=Math.abs(x);
        double num2=Math.acos(x);   //return the cosine value .it must be less than 1 OW sho will be NaN
       // double num3=Math.addExact(x,y);
        double num4=Math.ceil(x);
        double num5=Math.floor(x);
        double num6=Math.max(x,y);
        double num7=Math.ulp(x);
        double num8=Math.toDegrees(90);
        double num9=Math.toRadians(5156.620156177409);
        double num10=Math.signum(9.88);


        String st="Pranay";

        System.out.println(  st.contains("prnay"));

        System.out.println(num1);
        System.out.println(num2);
       // System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);
        System.out.println(num8);
        System.out.println(num9);
        System.out.println(num10);
    }
}
