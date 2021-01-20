public class PerfectNum {
    public static void main(String[] args) {

/*        for (int j = 1; j <= 1000; j++) {
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
 */

        //naudojant metodus
        for (int j = 1; j <= 1000; j++) {
            if (isNumberPerfect(j)) {
                System.out.println((j + " is a perfect number"));
            }
        }
    }

        static boolean isNumberPerfect(int number) {
            int sumOfDivisors = 0;
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sumOfDivisors += i;
                }
            }
            return sumOfDivisors == number;
        }

}
