package se.lexicon;

import java.util.Scanner;

public class Exercise02 {

    /**
     * 2. Create a program and create a method with name ‘indexOf’ which will find and return the index of an element in the array.
     * If the element does not exist your method should return -1 as value.
     * Expected output: Index position of number 5 is: 2.
     */
    public static void ex2() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number to find:");
    int in = scan.nextInt();
    int result = indexOf(in);
    System.out.println("Number:"+ result);

  }

  public static int indexOf(int inNumber) {
    int[] num = new int[]{36, 15, 8, 24, 56, 10, 2};
    int size = num.length;
    for (int i = 0; i < size; i ++) {
      if (num[i] == inNumber){
        return i;
      }
    }
    return -1;
  }

}