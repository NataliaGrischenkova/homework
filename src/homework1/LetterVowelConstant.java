package homework1;

import java.util.Scanner;

public class LetterVowelConstant {

    public static void defineVowelConstant() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи букву");
        String let = scanner.nextLine();

        switch (let) {
            case "e", "y", "u", "i", "o", "a":
                System.out.println("VOWEL");
                break;
            case "q", "w", "r", "t", "p", "s", "d", "f", "g", "h", "k", "l", "z", "x", "c", "v", "b", "n", "m":
                System.out.println("CONSTANT");
                break;
            default:
                System.out.println("NOT FOUND");
        }
    }
}

