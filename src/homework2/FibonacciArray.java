package homework2;

import java.util.Arrays;

public class FibonacciArray {

    public static int[] createFibArray(int n) {
        if (n < 0) {
            return null;
        }
        if (n == 1) {
            return new int[] {0};
        }
        if (n == 2) {
            return new int[] {0, 1};
        }
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;

        for (int numb = 2; numb < arr.length; numb++) {
            arr[numb] = arr[numb - 1] + arr[numb - 2];
        }
        return arr;
    }
}
