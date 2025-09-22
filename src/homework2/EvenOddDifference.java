package homework2;

public class EvenOddDifference {
    static int getDifference(int[] array) {
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sumEven += array[i];
            } else {
                sumOdd += array[i];
            }
        }
        return Math.abs(sumEven - sumOdd);
    }
}
