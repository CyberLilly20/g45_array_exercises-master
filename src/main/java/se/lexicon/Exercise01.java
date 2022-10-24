package se.lexicon;

import java.util.Arrays;

public class Exercise01 {

  /**
   * 1. Write a program which will store elements in an array of type ‘int’ and
   * print it out.
   * Expected output: 11 23 39 etc.
   */
  public static void ex1() {

    int[] numbers = {15,25,35,45};
    int size = numbers.length;

    for(int i=0; i<size ; i++)

      System.out.println(numbers[i]);


  }


}
