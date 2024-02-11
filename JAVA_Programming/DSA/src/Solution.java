import java.util.ArrayList;
import java.util.List;

class Solution {
    public static String reverseWords(String s) {
        String [] arr=s.split("\\s+");
        List <String>list=new ArrayList<String>();

        for (int i=arr.length-1;i>=0;i--){
            list.add(arr[i]);
        }
       String s1= list.toString();
        return s1;
    }


    public static void main(String[] args) {

     String s= Solution.reverseWords("my name is pranay");

        System.out.println(s);
    }

}