package se.lexicon;

import java.util.Arrays;

public class Exercise03 {

    /**
     * 3. Write a program which will sort string array.
     * Expected output:
     *                String array: [Paris, London, New York, Stockholm]
     *                Sort string array: [London, New York, Paris, Stockholm]
     */
    public static void ex3() {
        //ex1
        String[] cities = {"Paris", "London", "New York", "Stockholm"};

        System.out.println("Array of cities: " + Arrays.toString(cities));
        Arrays.sort(cities);

        System.out.println("Sorted cities: "+ Arrays.toString(cities));

       /* //ex2
        String[] cities = {"Paris", "London", "New York", "Stockholm"};
        int size = cities.length;

        for ( int i = 0; i < size; i++){
            for (int j = i; j < size; j++){
                if(cities[i].compareTo(cities[j])>0){
                    String str = cities[i];
                    cities[i] = cities[j];
                    cities[j]= str;
                }
            }
        }
        System.out.println(Arrays.toString(cities));*/
    }







}
