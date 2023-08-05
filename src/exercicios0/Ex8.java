package exercicios0;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        if (sc.hasNextInt()) {
            int n = sc.nextInt();

            if (n % 2 == 0) {
                System.out.println(n + " is an even number");
            }
            else {
                System.out.println(n + " is an odd number");
            }
        }
        else {
            System.out.println("Error: Enter an integer");
        }

        sc.close();
    }
}
