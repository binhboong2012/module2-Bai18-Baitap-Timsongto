public class OptimizedPrimeFactorization implements Runnable {


    @Override
    public void run() {
        int num = 2;
        while (num < 100) {
            boolean check = false;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    check = true;
                    break;
                }

            }
            if (!check) {
                System.out.println("lazy: " + num);
            }
            num++;
        }

    }
}
