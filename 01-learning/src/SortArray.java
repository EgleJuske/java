public class SortArray {
    public static void main(String[] args) {

        int[] a = {-10, 0, 2, 9, -5};

        for (int i = 0; i < a.length; i++) {
            int max = a[i];
            int maxId = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] > max) {
                    max = a[j];
                    maxId = j;
                }
            }

        // uzfiksuojame laikinai reiksme kuria
        int temp = a[i];
        a[i] = max;
        a[maxId] = temp;
        }

        for (int e : a) {
            System.out.print(e + " ");
        }

    }
}
