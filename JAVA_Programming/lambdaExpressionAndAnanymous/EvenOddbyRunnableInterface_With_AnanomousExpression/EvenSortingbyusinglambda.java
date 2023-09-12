package EvenOddbyRunnableInterface_With_AnanomousExpression;

public class EvenSortingbyusinglambda {
    public static void main(String[] arg) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(" ");
                for (int counter = 0; counter < 100; counter++) {
                    if (counter % 2 != 0) {
                        System.out.println("odd number :" + counter);
                    }
                }
            }
        };
        runnable.run();

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                for (int counter = 0; counter < 100; counter++) {
                    if (counter % 2 == 0) {
                        System.out.println("Even number :" + counter);
                    }
                }
            }


        };
        runnable1.run();
    }
}


