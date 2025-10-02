package homework3;

import static homework3.Month.МАЙ;

public class Season {
    public static void seasonsChecker(Month month) {


        switch (month) {
            case ДЕКАБРЬ, ЯНВАРЬ, ФЕВРАЛЬ:
                System.out.println("Зима");
                break;
            case МАРТ, АПРЕЛЬ, МАЙ:
                System.out.println("Весна");
                break;
            case ИЮНЬ, ИЮЛЬ, АВГУСТ:
                System.out.println("Лето");
                break;
            case СЕНТЯБРЬ, ОКТЯБРЬ, НОЯБРЬ:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Ошибка");
        }
    }
}
