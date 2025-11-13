package hwstring;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи текст");
        String text = scanner.nextLine();

        // Подсчитывает общее количество слов в тексте.
        String[] words = text.split("\\s+");
        System.out.println("Количество слов втексте: " + words.length);

        // Находит самое длинное слово и выводит его.
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("Самое длинное слово в тексте: " + longestWord);

        // Определяет, сколько раз каждая буква алфавита встречается в тексте (игнорируя регистр).
        String lowerText = text.toLowerCase();
        System.out.println("Частота букв в тексте: ");
        for (char ch = 'a'; ch <= 'я'; ch++) {
            int count = 0;
            for (int i = 0; i < lowerText.length(); i++) {
                if (lowerText.charAt(i) == ch) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.println(ch + ": " + count);
            }
        }

        // Переворачивает каждое слово в тексте задом наперед, сохраняя порядок слов.
        System.out.print("Текст со словами задом наперед: ");
        for (String word : words) {
            String reversed = new StringBuilder(word).reverse().toString();
            System.out.println(reversed + " ");
        }

        // Проверяет, является ли текст палиндромом (читается одинаково слева направо и справа налево,
        // игнорируя пробелы и знаки препинания).
        if (isPalindrome(text)) {
            System.out.println("Текст является палиндромом");
        } else {
            System.out.println("Текст не является палиндромом");
        }
    }

    public static boolean isPalindrome(String text) {
        String clean = text.replaceAll("[^a-zA-Zа-яА-Я]", "").toLowerCase();
        StringBuilder reverse = new StringBuilder(clean).reverse();
        return clean.equals(reverse.toString());
    }
}
