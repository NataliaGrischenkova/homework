package homework1;

public class Main {

    public static void main(String[] args) {
        checkVowelOrConstant();
    }

    private static void checkVowelOrConstant() {
        LetterService letterService = new LetterService();
        letterService.defineVowelOrConstant();
    }

}

