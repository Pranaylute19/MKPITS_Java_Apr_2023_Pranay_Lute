import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rotation {
    public static void main(String[] args) {
        int rotation=2;
        List list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for (int i = 0; i < rotation; i++) {
            int temp = (int) list.get(list.size()-1);

            for (int j = 4; j > 0; j--) {
                list.set(j, list.get(j - 1));
            }
            list.set(0, temp);
        }

        // Printing list after rotation
        System.out.println("List Rotation :  "+ Arrays.toString(list.toArray()));

    }
}
