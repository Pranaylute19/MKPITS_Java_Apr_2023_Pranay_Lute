import org.json.simple.JSONObject;

public class Main {
    public static void main(String[] args) {

        JSONObject jsonObject=new JSONObject();
        jsonObject.put("Pranay","Dighori");
        jsonObject.put("Shubham", "itwari");
        jsonObject.put("Abhishek","nanded");
        jsonObject.put("Avinash","Amravati");
        System.out.println(jsonObject);
    }
}