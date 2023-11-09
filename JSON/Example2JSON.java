import org.json.simple.JSONValue;

import java.util.HashMap;
import java.util.Map;

public class Example2JSON {
    public static void main(String[] args) {
        Map map=new HashMap<>();
        map.put("Abhishek",new Integer(12));
        map.put("Divya",new Integer(12));
        map.put("Shubham",new Integer(13));
        map.put(new Integer(14),"tejswini");
        String jsn= JSONValue.toJSONString(map);

//        for (int loop=1;loop<=map.size();lo

        System.out.println(jsn);
    }
}
