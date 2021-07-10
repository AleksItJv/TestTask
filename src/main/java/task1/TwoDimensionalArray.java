package task1;

import task2.MySort;

import java.util.Arrays;
import java.util.Random;

public class TwoDimensionalArray {

    public static void main(String[] args) {

        Random rnd = new Random();
        //initialization
        int[][] arr = new int[Math.abs(rnd.nextInt(5)) + 1][Math.abs(rnd.nextInt(5)) + 1];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rnd.nextInt(100);
            }
        }
        System.out.println(Arrays.deepToString(arr));

        //max value
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            MySort.mySort(arr[i]);
            if (arr[i][arr[i].length - 1] > maxValue) {
                maxValue = arr[i][arr[i].length - 1];
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println(maxValue);

        //calculation
        double c = -1.49d;
        double d = 23.4d;

        double value1 = Math.sin(Math.sin(c));
        double value2 = (4 * Math.log(Math.log(d))) / maxValue;

        double y = Math.sqrt(Math.abs(value1 - value2));

        System.out.println(y);
    }
}
