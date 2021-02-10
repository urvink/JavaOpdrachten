package com.kirindongo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	  // write your code here
        String[] eastcars = {"Kia", "Honda"};
        String[] cars = {"Kia", "Volkswagen", "Renault", "Honda", "BMW"};
        ArrayList<String> westcars = new ArrayList<>();
        System.out.println("Opdracht 8\n-----------");

        /**
         * Vraag 8a
         * Maak gebruik van een for loop om de eerste drie items uit het cars Array te printen.
         */
        System.out.println("Opdracht 8A");
        for (int i = 0; i < 3; i++) {
            System.out.println(cars[i]);
        }

        /**
         * Vraag 8b
         * Maak gebruik van een for-each loop om alle items uit het cars Array te printen.
         */
        System.out.println("\nOpdracht 8B\n------------");
        for (String car: cars) {
            System.out.println(car);
        }

        /**
         * Vraag 8c
         * Loop door het cars array en vergelijk deze met de items in het eastcars array. Als je item niet in het eastcars array voor komt, voeg je hem toe aan het westcars array.
         */
        System.out.println("\nOpdracht 8C\n------------");
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].equals(eastcars[0]) || cars[i].equals(eastcars[1])) {
            } else {
                westcars.add(cars[i]);
            }
        }
        System.out.println("Westcars\n__________ ");
        for (String westcar: westcars) {
            System.out.println(" "+westcar);
        }

        /**
         * Vraag 8d
         * Als je een Array wil sorteren, moet je de Arrays class importeren
         * Als je een ArrayList wil sorteren, moet je de Collections class importeren.
         *
         * Pas dit nu toe op de Arrays en ArrayLists die je hebt gemaakt
         */
        System.out.println("\nOpdracht 8D\n------------");
        Arrays.sort(cars);
        System.out.println("Cars: "+Arrays.toString(cars));
        Arrays.sort(eastcars);
        System.out.println("East Cars: "+Arrays.toString(eastcars));
        Collections.sort(westcars);
        System.out.println("West Cars: "+westcars);
    }
}
