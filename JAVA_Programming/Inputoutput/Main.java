import ReadFirstThreeLine.LongestWord;
import ReadFirstThreeLine.ReadFirst3line;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ReadFirst3line rf=new ReadFirst3line();
        rf.methd();
        rf.readMethod();

        LongestWord lw=new LongestWord();
        lw.longest();
        System.out.println(lw);

    }
}