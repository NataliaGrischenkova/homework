package homework1;

import java.util.Scanner;

public class ExitOnCommand {

    public static void loopUntilExit() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введи слово");
            String let = scanner.nextLine();
            if (let.equals("exit")) {
                break;
            } else {
                System.out.println(let);
            }
        }
    }
}


