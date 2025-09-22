package homework1;

import java.util.Scanner;

public class LetterService {

    public void defineVowelOrConstant() {
        Scanner scanner = new Scanner(System.in);
        char let = scanner.next().toLowerCase().charAt(0);

        if (let == 'e' || let == 'y' || let == 'u' || let == 'i' || let == 'o' || let == 'a'){
            System.out.println("VOWEL");
        } else {
            System.out.println("CONSTANT");
        }
    }

}
