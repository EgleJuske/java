public class PerfectNum {
    public static void main(String[] args) {

        for (int j = 1; j <= 1000; j++) {
            int sumOfDivisors = 0;
            for (int i = 1; i < j; i++) {
                if (j % i == 0) {
                    sumOfDivisors += i;
                }
            }

            if (sumOfDivisors == j) {
                System.out.println(j + " is a perfect number");
            }
        }

    }
}
