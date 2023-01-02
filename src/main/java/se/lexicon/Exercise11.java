package se.lexicon;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise11 {

    /**
     * 11.Write a program that ask the user for an integer and repeat that
     * question until user give you a specific value that user already has been
     * told about as a message in your program. Store these values in an array
     * and print that array. After that reverse the array elements so that the
     * first element becomes the last element, the second element becomes
     * the second to last element, etc. Do not just reverse the order in which
     * they are printed. You need to change the way they are stored in the
     * array.
     */
    public static void ex11() {
        int[] arrays = new int[2];
        System.out.println("Enter numbers to add (min 2 numbers): ");

        Scanner scan = new Scanner(System.in);
        int numToAdd = scan.nextInt();
        int num1 = numToAdd - arrays.length;
        int num2 = arrays.length + num1;

        arrays = Arrays.copyOf(arrays, num2);
        int[] revArray = new int[arrays.length];
        System.out.println("Enter your " + numToAdd + " numbers here");
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = scan.nextInt();
        }
        int i = arrays.length - 1;
        for (int j = 0; j < arrays.length; j++) {
            revArray[j]= arrays[i];
            i--;
        }
        System.out.println("Your numbers: ");
        System.out.println(Arrays.toString(arrays));

        System.out.println("Reverse numbers: ");
        System.out.println(Arrays.toString(revArray));
    }

}
