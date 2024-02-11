import java.util.*;

public class Maximum {
    public static void main(String[] args) {
        List l=new ArrayList();
                l.add(1);
                l.add(2);
                l.add(3);
                l.add(4);

             Vector vector1=new Vector();
             for (int i=0;i<l.size();i++){
                 vector1.add(l.get(i));
             }
        System.out.println(vector1);
        Collections.rotate(l,2);
        System.out.println(l);

        Vector vector=new Vector();
        vector.add(1);
        vector.add(2);
        vector.add(5);
        vector.add(3);
        vector.add(4);


       int i= Collections.binarySearch(vector,4);
        System.out.println(i);

        int max= (int) Collections.max(vector);
        System.out.println(max);
        Collections.sort(vector);
        System.out.println(vector);
        System.out.println( vector.get(vector.size()-1));

        int []arr={2,3,4,5,1,9};
        Arrays.asList(arr);


    }
}
