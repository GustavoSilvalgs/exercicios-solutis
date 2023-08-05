package exercicios0;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");
        int prodCode = sc.nextInt();

        if (prodCode == 001) {
            System.out.println("Parafuso");
        }
        else if (prodCode == 002) {
            System.out.println("Porca");
        }
        else if (prodCode == 003) {
            System.out.println("Prego");
        }
        else {
            System.out.println("Diversos");
        }

        sc.close();
    }
}
