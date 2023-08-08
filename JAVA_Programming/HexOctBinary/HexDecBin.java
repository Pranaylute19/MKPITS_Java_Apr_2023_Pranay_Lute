package HexOctBinary;

public class HexDecBin {
    public void seperation(int num1){
        System.out.println("Binary Number "+Integer.toBinaryString(num1));
        System.out.println("Hexa number "+Integer.toHexString(num1));
        System.out.println("Octal Number "+Integer.toOctalString(num1));
        System.out.println(Integer.hashCode(99));
        System.out.println(Integer.compare(7,7));
    }
}
