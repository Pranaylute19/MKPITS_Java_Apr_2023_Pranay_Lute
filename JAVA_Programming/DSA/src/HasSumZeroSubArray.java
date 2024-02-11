import java.util.HashSet;
import java.util.Set;

public class HasSumZeroSubArray {
    public static void main(String[] args) {
        int[] nums = { 4, 1,-6,-1, 3, 1, 4, 2, 7 };
        Set set=new HashSet();
        set.add(0);
        int sum=0;
        for (int i=0;i< nums.length;i++){
            sum =sum+ nums[i];
        }
        if (set.contains(sum)) {
            System.out.println("Subarray exists");
        }
        else System.out.println("not exits");
        set.add(sum);
    }
}
