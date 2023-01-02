package se.lexicon;

public class Exercise12 {

    /**
     * 12.Write a program which will print the diagonal elements of two dimensional array.
     * Expected output: 1 4 9
     */
    public static void ex12() {
        int[][] numbers = {{1, 2, 3,}, {5, 4, 6,}, {7, 8, 9,}};
        for (int i = 0; i < numbers.length ; i++){
            for (int j =0; j < numbers.length; j++){
                System.out.println(numbers[i][j] + " ");
            }
            System.out.println("\n");
        }
        int i = 0, j =0;
        System.out.println("Diagonal elements: ");
        while (i < numbers.length && j < numbers.length){
            System.out.println(numbers[i][j] + "\t");
            i++;
            j++;
        }
            System.out.println("\n");
    }


}
