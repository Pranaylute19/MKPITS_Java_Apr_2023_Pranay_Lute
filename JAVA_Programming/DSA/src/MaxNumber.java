public class MaxNumber {
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5, 6, 7, 90};
        int num1 = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 1; j < num.length; j++) {
                num1 = Math.max(num[i], num[j]);

            }

        }System.out.println(num1);
    }
}
