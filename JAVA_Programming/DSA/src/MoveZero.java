import java.util.Arrays;
import java.util.List;

public class MoveZero {
    public static void main(String[] args) {
       int nums[]={1,2,0,0,3,5};

      Arrays.sort(nums);
     List l= Arrays.asList(nums);
      for (int i:nums) {
          System.out.println(nums[i]);
      }
        System.out.println(l);
    }
}
