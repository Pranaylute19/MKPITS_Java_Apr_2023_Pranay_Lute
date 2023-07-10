public class StarPatternDiamond {
    public static void main(String[] args) {
            

            char[][] pattern = new char[size][size];

            for (int outerloop = 0; outerloop < size; outerloop++) {
                for (int innerloop = 0; innerloop < size;innerloop++) {
                    if (outerloop + innerloop == size / 2 && outerloop == rowPos && innerloop == colPos) {
                        pattern[outerloop][innerloop] = '*';
                    } else if (outerloop+ innerloop== size / 2 || innerloop - outerloop == size / 2 || outerloop - innerloop == size / 2 || outerloop + innerloop == size + size / 2-1) {
                        pattern[outerloop][innerloop] = '*';
                    } else {
                        pattern[outerloop][innerloop] = ' ';
                    }
                    System.out.print(pattern[outerloop][innerloop] + " ");
                }
                System.out.println();
            }
        }
    }