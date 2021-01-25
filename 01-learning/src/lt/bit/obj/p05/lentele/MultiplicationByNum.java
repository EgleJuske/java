package lt.bit.obj.p05.lentele;

import java.util.Scanner;

public class MultiplicationByNum {
    public static void main(String[] args) {
        Scanner findNum = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = findNum.nextInt();

        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            result.append(i).append(" * ").append(num).append(" = ").append(i * num);
            if (i != 10) {
                result.append("\n");
            }
        }
        System.out.print(result);
    }
}
