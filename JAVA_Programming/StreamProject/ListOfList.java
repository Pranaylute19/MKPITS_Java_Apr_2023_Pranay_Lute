import java.lang.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfList {
    public static void main(String[] args) {
        List <List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(23,44,55));
        list.add(Arrays.asList(11,32,22));
        list.add(Arrays.asList(88,76,78));

        List<Integer> merge=list.stream().flatMap(l->l.stream()).collect(Collectors.toList());
        System.out.println(merge);
        int sumlist=merge.stream().reduce(0,Integer::sum);
        System.out.println(sumlist);
    }
}
