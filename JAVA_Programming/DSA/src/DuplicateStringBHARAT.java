import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DuplicateStringBHARAT {
    public static void main(String[] args) {
        String s[]={ "indore","Indore","Indore","Indore","bhopal","Bhopal","Guna","Mandsaur","Indore"};
        int count=0;
        HashSet hashSet=new HashSet();
        List list=new ArrayList();

        for (int i=0;i<s.length;i++){
            if(!hashSet.add(s[i])){
                list.add(s[i]);
                count++;
            }
        }
        System.out.println("Duplicate String :"+list);
        System.out.println(count);
//        ------------------------------Common prefix in string------------------

        String []strings={"Bhopal","Bhilai","Bhunaweshwar","Ahmebad"};
        System.out.println();

    }
}
