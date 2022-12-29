package se.lexicon;

import java.util.Arrays;

public class Exercise07 {

    /**
     * 7. Write a program which will set up an array to hold 10 numbers and print out only the uneven numbers.
     * Expected output: Array: 1 2 4 7 9 12
     * Odd Array: 1 7 9
     */
    public static void ex7() {

        int[] arrays = {15, 10, 23, 45, 2, 7, 33, 6, 78, 9};
        Arrays.sort(arrays);
        int num = arrays.length;

        for (int i = 0; i <= num; i++) {
            System.out.println(" Array: " + i);
            if (i % 2 != 0) {
                System.out.print("Odd numbers of array:" + i);
            }


        }


    }

}
