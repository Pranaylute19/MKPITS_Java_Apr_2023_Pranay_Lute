import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MajorCount {
    public static void main(String[] args) {
        int []nums={3,2,3};
        Set set=new HashSet();
        List<Integer> list=new ArrayList();
        for(int i=0;i<nums.length;i++){
            if(!set.add(nums[i])){
                list.add(nums[i]);
            }
        }
        int index=0;
        for(int j:list){
            nums[index]=j;
            index++;
        }
        System.out.println(list);
    }
}
