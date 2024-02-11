import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeTwoArray {
    public static void main(String[] args) {
       int x[] = { 1, 4, 7, 8, 10 };
       int y[] = { 2, 3, 9 };
       int m=3;
       int n=3;

        List l=new ArrayList();

        for(int i=0;i<m;i++){
            l.add(x[i]);
        }
        for(int j=0;j<n;j++){
            l.add(y[j]);
        }
        Collections.sort(l);
        System.out.println(l);
    }
}
