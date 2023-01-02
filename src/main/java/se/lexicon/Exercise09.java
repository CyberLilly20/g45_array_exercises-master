package se.lexicon;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise09 {

  /**
   * 9. Write a method which will add elements in an array.
   * Remember that arrays are fixed in size so you need to come up with a
   * solution to “expand” the array
   */
  public static void ex9() {

      int[] array1 = { 12, 22, 38, 45, 56};
      System.out.println(" The number in the array are:" + Arrays.toString(array1));


      int[] array2 = Arrays.copyOf(array1, array1.length+ 1);

      Scanner scan = new Scanner(System.in);
      for (int i = 0; i < array1.length; i++){
          array2[i] = array1[i];
      }
      System.out.println("Input a number to add on the list: ");
      array2[array2.length - 1] = scan.nextInt();
      System.out.println(" The list is added: " + Arrays.toString(array2));





  }

}
