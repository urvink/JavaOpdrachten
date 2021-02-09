package com.kirindongo;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	  // write your code here
        String[] eastcars = {"Kia, Honda"};
        String[] cars = {"Kia", "Volkswagen", "Renault", "Honda", "BMW"};
        ArrayList<String> westcars = new ArrayList<>();
        System.out.println("Opdracht 8\n-----------");

        //Vraag 8a
        System.out.println("a)");
        for (int i = 0; i < 3; i++) {
            System.out.println(cars[i]);
        }

        //Vraag 8b
        System.out.println("\n8b\n------------");
        for (String car: cars) {
            System.out.println(car);
        }

        //Vraag 8c
        System.out.println("\n8c\n------------");
        for (String car: cars) {

            System.out.println(car);
            if (Arrays.stream(eastcars).anyMatch(car)){
                System.out.println("HIYYAAAA");
            }else {
                System.out.println("DOH!!");
            }
        }

//            for (int i = 0; i < cars.length; i++) {
//                if (cars[i] == eastcars[i]) {
//                    System.out.println("Deze komen overeen" + eastcars[i]);
//                } else {
//                    System.out.println("HOI");
//                    westcars.add(cars[i]);
//                }
//            }

    }

}
