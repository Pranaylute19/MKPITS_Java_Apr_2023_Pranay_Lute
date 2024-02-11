import java.util.Arrays;
import java.util.List;

public class ReverseEachWord {
    public static void main(String[] args) {
        String s="my name is pranay";
        String[]arr=s.split(" ");
        for (int i=0;i<arr.length;i++){
            String string=new StringBuilder(arr[i]).reverse().toString();
            System.out.println(string);
        }

    }
}
