import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RotationArray {
    public static void main(String[] args) {
        Integer arr[] = {5, 2, 3, 4, 7, 6};

        int num[]=new int[arr.length];
        List <Integer>ln=Arrays.asList(arr);
        Collections.rotate(ln,2);
        System.out.println(ln);

        for (int i=0;i< ln.size();i++){
//            arr[i]=ln[i];
            System.out.println(num[i]);
        }

    }
}

