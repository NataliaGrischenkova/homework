package homework2;

import java.util.Arrays;

import static homework2.FibonacciArray.createFibArray;

public class Main {
    public static void main(String[] args) {
        // int[] result = FibonacciArray.createFibArray(10);
       // System.out.println(Arrays.toString(result));

           // int[] array = {22, 11, 33, 7, 83, 113, 49};
           // int sum = ArrayMinMaxSum.getSumMinMax(array);
           // System.out.println(sum);

        int[] array = {22, 11, 33, 7, 83, 113, 49};
        int diff = EvenOddDifference.getDifference(array);
        System.out.println(diff);
    }
}
