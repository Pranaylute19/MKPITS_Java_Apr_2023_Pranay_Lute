import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StringListSortingAscendingOrder {
    public static void main(String[] args) {
        // sorted Ascending order list of String list
        List<String> list = Arrays.asList("Ashish", "raj", "shubh", "abhi", "teju");
       List lst1= list.stream().sorted().collect(Collectors.toList());
        System.out.println(lst1);


//        Set lst2= list.stream().sorted().collect(Collectors.toSet());
//        System.out.println(lst2);


    }
}
