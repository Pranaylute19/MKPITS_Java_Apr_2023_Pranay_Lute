import java.util.ArrayList;
import java.util.List;

public class MultiplicationExceptInitial {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};
        List list=new ArrayList();
        for (int i=0;i<nums.length-1;i++){
            for (int j=1;j< nums.length-1;j++){
                nums[j]=nums[j]*nums[j+1];
                list.add(i,nums[j]);
            }
            System.out.println(list);
        }
    }
}

