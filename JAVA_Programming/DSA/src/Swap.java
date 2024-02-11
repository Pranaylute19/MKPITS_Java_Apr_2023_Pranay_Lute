import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Swap {
    public static void main(String[] args) {
        int[] A =  { 0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0 };

//        int j = 0;
//        for (int i=0;i<A.length;i++) {
//            if (A[i] < 1) {
//                int temp = A[i];
//                A[i] = A[j];
//                A[j] = temp;
//                j++;
//            }
//        }
//         System.out.println(Arrays.toString(A));

        List list=new ArrayList<>();
        for (int i=0;i< A.length;i++){
            Arrays.sort(A);
            list.add(A[i]);

        }
        System.out.println(list);
    }
}
