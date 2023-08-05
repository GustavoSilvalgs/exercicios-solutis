package exercicios01;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String word = sc.nextLine();

        int vowels = 0;
        int spaces = 0;
        int consonants = 0;

        String lowercaseWord = word.toLowerCase();

        for (int i = 0; i < lowercaseWord.length(); i++) {
            char ch = lowercaseWord.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (ch == ' ') {
                spaces++;
            }
        }

        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of spaces: " + spaces);
        System.out.println("Number of consonants: " + consonants);
    }
}
