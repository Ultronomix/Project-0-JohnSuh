package com.github.project0;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;

public class Body {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cicada c = new Cicada();
        HashSet<String> species1 = Cicada.species;
        HashSet<String> county1 = Counties.county;
        // System.out.println(county1);

        System.out.println(
                "Hello and welcome to the Cicada Tracker." + "\nPlease type the number of what you would like to do.");
        System.out.println("1. Log a sighting" + "\n2. Check your sightings" + "\n3. Exit");

        while (input.hasNextInt()) {
            switch (input.nextInt()) {
                case 1:
                    System.out.println("Please input the county you are in: ");

                    break;

                case 2:
                    System.out.println("Here are your recorded sightings: ");

                    break;

                case 3:
                    System.out.println("Goodbye.");
                    break;

                default:
                    break;
            }

        }

        while (input.hasNext()) {
            String user = input.next();
            if (county1.contains(user)) {
                System.out.println("You have selected " + user + ".");
            } else if (){
                System.out.println("Please select a valid county. \nTo see available counties type 0");
                Iterator<String> it = county1.iterator();
                System.out.println(it.next());
            }
        }

    }
}
