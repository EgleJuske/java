package lt.bit.obj.p03;

public class SortArray {
    public static void main(String[] args) {

        int[] a = {-10, 0, 2, 9, -5};

        //ciklas eina per kiekviena masyvo reiksme ir kiekviena karta uzfiksuoja max reiksme ir jos id
        for (int i = 0; i < a.length; i++) {
            int max = a[i];
            int maxId = i;

            //ciklas prasideda nuo vienu indeksu didesnes reiksmes ir tikrina ar ji didesne nei buvo nustatyta
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] > max) {
                    max = a[j];
                    maxId = j;
                }
            }

        // uzfiksuojame reiksme ir ja sukeiciame vietomis su rasta max reiksme
        int temp = a[i];
        a[i] = max;
        a[maxId] = temp;
        }

        for (int e : a) {
            System.out.print(e + " ");
        }

    }
}
