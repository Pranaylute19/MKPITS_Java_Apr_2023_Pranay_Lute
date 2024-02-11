import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int []arr={1,2,3,4,3,2,1,2,3,4,4,5,8};

        Set set=new HashSet<>();
        Set set1=new HashSet<>();
        for (int i=0;i<arr.length;i++){
            if (!set.add(arr[i])){
                 set1.add(arr[i]);
            }
        }
        System.out.println("Duplicates number"+set1);
        System.out.println("Remove Duplicate String"+set);

    }
}
