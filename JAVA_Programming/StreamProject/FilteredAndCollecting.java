import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteredAndCollecting {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("ashish", "raj", "shubh", "abhi", "teju","rajabhai");

        List <String> lst=list.stream().filter(x->x.startsWith("a")).collect(Collectors.toList());
        System.out.println(lst);
    }
}
