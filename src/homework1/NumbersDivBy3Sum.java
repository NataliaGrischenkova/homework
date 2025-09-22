package homework1;

import java.util.Scanner;

public class NumbersDivBy3Sum {

    public static void sumOfNumbersDivBy3 () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи первое число");
        int num1 = scanner.nextInt();
        System.out.println("Введи второе число");
        int num2 = scanner.nextInt();

        int start = Math.min(num1, num2);
        int end = Math.max(num1, num2);
        int sum = 0;
        for (int i = start + 1; i < end; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println("Сумма чисел, делящихся на 3: " + sum);
    }
}
