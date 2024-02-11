
public class IntegerToBinary {
    public static void main(String[] args) {
        int num=70;

        System.out.println("Binary numbers :"+ Integer.toBinaryString(num));

        String binary="1001110";

        System.out.println("Binary to Integer :"+ Integer.parseInt(binary,3));
        //2---> Binary
        //8 -->octal
        // 10 --> Decimal
    }
}
