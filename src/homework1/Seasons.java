package homework1;

import java.util.Scanner;

public class Seasons {
    public static void seasonsChecker() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи название месяца");
        String str = scanner.nextLine();

        switch (str){
            case "сентябрь", "октябрь", "ноябрь":
                System.out.println("Осень");
                break;
            case "декабрь", "январь", "февраль":
                System.out.println("Зима");
                break;
            case "март", "апрель", "май":
                System.out.println("Весна");
                break;
            case "июнь", "июль", "август":
                System.out.println("Лето");
                break;
            default:
                System.out.println("Ошибка");
        }
    }
}
