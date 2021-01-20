public class DiffOfAvg {
    public static void main(String[] args) {

        int[] a = {5, 6, 10, 15, 8, 4};
        int[] b = {8, 5, 3};

        int sumA = 0;
        for (int i : a) {
            sumA += i;
        }
        double avgA = (double)sumA / a.length;

        int sumB = 0;
        for (int i : b) {
            sumB += i;
        }

        double avgB = (double)sumB / b.length;

        double diff = avgA - avgB;

        System.out.print("the sum of array a is " + sumA);
        System.out.println(" and the average is " + avgA);

        System.out.print("the sum of array b is " + sumB);
        System.out.println(" and the average is " + avgB);

        System.out.println("the difference between array averages is " + diff);
    }
}
