package exercicios01;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first value: ");
        int value1 = sc.nextInt();
        System.out.print("Enter the second value: ");
        int value2 = sc.nextInt();

        int largest;

        if (value1 > value2) {
            largest = value1;
        }
        else {
            largest = value2;
        }

        System.out.println("Highest value = " + largest);

        sc.close();
    }
}
