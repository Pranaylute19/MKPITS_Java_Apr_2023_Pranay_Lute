import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MappingIntegerNumber {
    public static void main(String[] args) {
        //mappng Integer and multiplied double number

        List<Integer> list=new ArrayList<Integer>();
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        List lst1=list.stream().map(number ->number*2).collect(Collectors.toList());
        System.out.println(lst1);
    }
}
