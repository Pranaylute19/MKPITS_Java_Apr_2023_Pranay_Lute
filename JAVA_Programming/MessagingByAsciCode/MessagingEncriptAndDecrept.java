public class MessagingEncriptAndDecrept {
    public void increptMessaging(String message) {

        String alphabets = message;

//        int asc = 0;
        for (int i = 0; i < alphabets.length(); i++) {
            char ch = alphabets.charAt(i);
            int asc = ch%10;
            System.out.print(asc+"-");
        }
    }
    public void decriptMessaging(){

    }
}

