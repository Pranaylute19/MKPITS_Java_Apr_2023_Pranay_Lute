import java.util.*;

public class DuplicateCharacterInString {
    public static void main(String[] args) {
        String s="Pranay";
        char ch[]=s.toCharArray();
        Set set=new LinkedHashSet();
        for(int i=0;i<s.length();i++){
            if(set.contains(ch[i])){
                continue;
            }
            set.add(ch[i]);
        }
        System.out.println(set);
    }
}
