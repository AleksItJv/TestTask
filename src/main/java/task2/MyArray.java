package task2;

import java.util.Arrays;
import java.util.Random;

public class MyArray {

    public static void main(String[] args) {

        Random rnd = new Random();

        int[] arr = new int[Math.abs(rnd.nextInt(10))];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(100);
        }

        System.out.println(Arrays.toString(arr));

        int[] arr2 = new int[arr.length];
        System.arraycopy(arr, 0, arr2, 0, arr.length);
        int[] arr3 = new int[arr.length];
        System.arraycopy(arr, 0, arr3, 0, arr.length);

        /* sort */
        MySort.mySort(arr2);
        System.out.println(Arrays.toString(arr2));

        /* check */
        //Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
    }
}
