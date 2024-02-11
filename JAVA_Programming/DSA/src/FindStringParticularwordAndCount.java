public class FindStringParticularwordAndCount {
    public static void main(String[] args) {
        String[]strings={"abc","abc","def","ghe","abc"};
        String find="abc";
        int n=0;
        for (int i=0;i<strings.length;i++){
            if (find==strings[i]){
                n++;
            }
        }
        System.out.println(find+" "+n);
    }
}
