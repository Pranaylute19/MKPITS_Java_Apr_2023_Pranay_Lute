import Calcutaor.Addition;
import Calcutaor.CommonAbstractMethod;
import Calcutaor.Multiplication;

public class Main {
    public static void main(String[] args) {
        CommonAbstractMethod cmn;

        switch(2) {
            case 1:
                cmn=new Multiplication();
                int result = cmn.calci(5, 7);
                System.out.println(result);
                break;
            case 2:
                cmn=new Addition();

                result =cmn.calci(8,9);
                System.out.println(result);
                break;
        }
    }
}