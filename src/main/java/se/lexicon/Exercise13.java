package se.lexicon;

import java.util.Arrays;

public class Exercise13 {

  /**
   * 13. Create two arrays with arbitrary size and fill one with random numbers.
   * Then copy over the numbers from the array with random numbers so
   * that the even numbers are located in the rear (the right side) part of the
   * array and the odd numbers are located in the front part (the left side).
   */
  public static void ex13() {
    int array1[] = {11,22,33,44,55};
    int array2[] = new int[array1.length];
    int front =0;
    int back = array1.length - 1;
    for (int j : array1) {
      if (j % 2 == 0) {
        array2[back] = j;
        back--;
      } else {
        array2[front] = j;
        front++;
      }
    }
    System.out.println("Array1:" + Arrays.toString(array1));
    System.out.println("Array2:" + Arrays.toString(array2));

  }

}
