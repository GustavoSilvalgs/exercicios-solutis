package exercicios0;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of A: ");
        int a = sc.nextInt();

        System.out.print("Enter the value of B: ");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Swapped values: ");
        System.out.println("Value A: " + a);
        System.out.println("Value B: " + b);

        sc.close();
    }
}
