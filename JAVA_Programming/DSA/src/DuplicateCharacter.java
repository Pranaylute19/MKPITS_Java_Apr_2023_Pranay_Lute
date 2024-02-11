import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DuplicateCharacter {
    public static void main(String[] args) {
        char []chars={'a','b','c','d','a','b','c'};
        HashSet set=new HashSet();
        List list=new ArrayList<>();
        for (int i=0;i< chars.length;i++){

//            if (!set.add(chars[i])){
//                list.add(chars[i]);
//            }

        }
        System.out.println(list);
        System.out.println(set);
    }
}
