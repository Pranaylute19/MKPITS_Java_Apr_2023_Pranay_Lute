import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class UsingPredicate {
    public static void main(String[] args) {

      List<Integer> lst=Arrays.asList(1,3,4,5,6,7);
        Predicate<Integer>pred=n->n<7;
        List<Integer>numb=lst.stream().filter(pred).collect(Collectors.toList());
        System.out.println(numb);
    }
}
