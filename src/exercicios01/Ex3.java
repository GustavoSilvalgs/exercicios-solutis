package exercicios01;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        System.out.println("Prime numbers less than " + n + ":");
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}