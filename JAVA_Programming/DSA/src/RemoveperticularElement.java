import java.util.ArrayList;
import java.util.List;

public class RemoveperticularElement {
    public static void main(String[] args) {
        int []arr={3,2,2,3};
        int n=3;
        List list=new ArrayList<>();
        for (int i=0;i< arr.length;i++){
            if (n!=arr[i]){
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }
}
