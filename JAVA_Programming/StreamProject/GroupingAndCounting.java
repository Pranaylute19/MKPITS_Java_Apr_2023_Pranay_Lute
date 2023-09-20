import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingAndCounting {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ashish", "raj", "shubh", "abhi", "teju");
        Map<Integer, Long> map = list.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(map);

        map.forEach((key,value)-> System.out.println("String "+key+" are "+value));
    }
}
