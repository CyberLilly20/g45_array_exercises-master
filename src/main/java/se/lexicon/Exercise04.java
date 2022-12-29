package se.lexicon;

import java.util.Arrays;

public class Exercise04 {

  /**
   * 4. Write a program which will copy the elements of one array into another array.
   * Expected output:
   *                Elements from first array: 1 15 20
   *                Elements from second array: 1 15 20
   */
  public static void ex4() {


    int[] array1 ={ 1, 15, 20 };
    int[] copyArray1 = Arrays.copyOf(array1, array1.length);

    System.out.println("Elements from array 1:" + Arrays.toString(array1));
    System.out.println("Elements from copyArray1:" + Arrays.toString(copyArray1));


  }

}
