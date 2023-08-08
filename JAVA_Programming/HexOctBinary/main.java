package HexOctBinary;

import java.util.Scanner;

public class main {
    public static void main(String[]arg){
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HexDecBin hex=new HexDecBin();
        hex.seperation(n);

    }
}
