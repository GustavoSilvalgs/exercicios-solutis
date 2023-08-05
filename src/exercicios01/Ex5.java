package exercicios01;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] daysOfWeek = {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        };

        System.out.print("Enter a number from 1 to 7: ");
        int n = sc.nextInt();

        if (n >= 1 && n <= 7) {
            String day = daysOfWeek[n -1];
            System.out.println("The corresponding day of the week is: " + day);
        }
        else {
            System.out.println("Invalid number! Enter a number between 1 and 7");
        }

        sc.close();
    }
}
