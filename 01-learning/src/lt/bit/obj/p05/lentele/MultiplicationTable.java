package lt.bit.obj.p05.lentele;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.printf("%s x %2s = %4s \t\t", j, i, (i*j));
            }
            System.out.println();
        }
        System.out.println();


        for (int i = 1; i <= 10; i++) {
            for (int j = 6; j <= 10; j++) {
                System.out.printf("%s x %2s =%4s \t\t", j, i, (i*j));
            }
            System.out.println();
        }
        System.out.println();
    }
}
