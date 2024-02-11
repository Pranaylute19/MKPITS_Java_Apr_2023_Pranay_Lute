import java.util.Arrays;

public class PalindromeString {
    public static boolean checkString() {
        String s = "12321";
        String joinString= s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        String ss="";
        for (int i=0;i>joinString.length();i++){
            ss+=joinString.charAt(i);
        }
        return (joinString.equals(ss));
    }
    public static void main(String[] args) {
        System.out.println(checkString());
    }
}

