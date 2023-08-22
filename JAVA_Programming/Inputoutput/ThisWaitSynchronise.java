public class ThisWaitSynchronise {

        public void methd() {
        int num1 = 0;
        synchronized (this) {
            while (num1 == 6) {
                try {
                    System.out.println(num1);
                    this.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
    }

