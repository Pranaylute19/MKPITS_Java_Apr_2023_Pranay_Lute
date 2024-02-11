import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindLargestTwonumber {
    public static void main(String[] arg) {
        int arr[] = {-10, -3, 5, 6, -2};
        int len= arr.length;

        Arrays.sort(arr);
        List list=new ArrayList<>();
        for (int ar:arr){
            list.add(ar);

        }  System.out.println(list);
        System.out.println("Greatest two number :"+list.get(len-1)+" "+list.get(len-2));

    }
}
