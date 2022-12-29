package se.lexicon;

public class Exercise05 {

  /**
   * 5. Create a two-dimensional string array [2][2]. Assign values to the 2d array containing any Country and City.
   * Expected output:
   * France Paris
   * Sweden Stockholm
   */
  public static void ex5() {

    String[][] cityCou = new String[2][2];

    cityCou[0][0] = "France";
    cityCou[0][1] = "Paris";
    cityCou[1][0] = "Sweden";
    cityCou[1][1] = "Stockholm";

    for (int i = 0; i < cityCou.length; i++) {
      for (int j = 0; j < cityCou[i].length; j++) {

        System.out.print(cityCou[i][j] + "\t");
      }
      System.out.println("\n");


    }

    //ex2 teacher solution
   /* String[][] countries = new String[2][2];
    String[] arr = {"France", "Paris", "Sweden", "Stockholm"};
    int index = 0;

    for (int i = 0; i < countries.length; i++){
      for (int j = 0; j < countries.length; j++){
        countries[i][j] = arr[index];
        index++;

      }
    }

    System.out.println(countries[0][0] + "," + countries [0][1]);
    System.out.println(countries[1][0] + "," + countries [1][1]);
    */


  }
}