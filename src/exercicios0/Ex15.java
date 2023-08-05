package exercicios0;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        System.out.println("Digite 50 números: ");

        do {
            int n = sc.nextInt();
            sum += n;
            count++;
        }
        while (count < 50);

        double average = (double) sum / 50;
        System.out.println("Média dos 50 números = " + average);

        sc.close();
    }
}
