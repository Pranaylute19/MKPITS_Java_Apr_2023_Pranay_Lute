package EvenOddbyRunnableInterface_WithlambdaExpression;

public class EvenOddSortingbylambda {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int counter = 0; counter<100;counter++){
                if (counter % 2 != 0) {
                    System.out.println("odd number :" + counter);
                }
            }
        };
        runnable.run();

        Runnable runnable1 = () -> {
            for (int counter = 0; counter<100;counter++){
                if (counter % 2 == 0) {
                    System.out.println("Even number :" + counter);
                }
            }
        };
    }
}
