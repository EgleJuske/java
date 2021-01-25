package lt.bit.obj.p04;

public class PrimaryNums {

    public static void main(String[] args) {

        int start = 10;
        int end = 91;

        for (int j = start; j <= end; j++) {
            int count = 0;
            for (int i = 1; i <= j; i++) {
                if (j % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(j + " ");
            }
        }

    }
}
