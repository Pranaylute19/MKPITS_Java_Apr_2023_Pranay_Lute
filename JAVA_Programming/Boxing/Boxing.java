package Boxing;

public class Boxing {
    public static void main(String[] arg) {
        String str = "1234";

        int j=2334;

        Integer nt=new Integer(str);
        System.out.println("Boxing  "+nt);
        int i=nt.intValue();
        System.out.println("Unboxing "+i);
        Integer b=j;
        System.out.println("Autoboxing "+j);

    }
}