package homework2;

import java.util.Arrays;
import java.util.Objects;

public class ArrayMinMaxSum {

    public static int getSumMinMax (int[] array) {
        if (Objects.nonNull(array)) {
            if (array.length > 1) {
                Arrays.sort(array);
                int min = array[0];
                int max = array[array.length - 1];
                return min + max;
            } else {
                System.out.println("Массив содержит только 1 элемент");
                return array[0];
            }
        } else {
            System.out.println("Ошибка ввода данных.");
            return -1;
        }
    }
}
