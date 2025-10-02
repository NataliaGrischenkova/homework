package homework3;

import java.util.Arrays;

public class ArrayService {

    public static void sort (int[] array) {
        Arrays.sort(array);
    }

        public static int findMax(int[] array) {
            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            return max;
        }

        public static int findIndex(int[] array, int value) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == value) {
                    return i;
                }
            }
            return -1;
            }
        }

// Создать класс для работы с массивами чисел. Создать методы для сортировки, нахождения максимального элемента,
// поиска номера элемента в массиве по его значению (любое вхождение). Всю общую логику вынести в приватные методы.