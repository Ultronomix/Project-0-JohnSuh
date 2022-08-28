package com.github.project0;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.HashSet;

import com.github.project0.common.datasource.ConnectionFactory;


public class Body {

    static void DateLocale(LocalDateTime date, String county, String species) {

    }

    public static void main(String[] args) {

        try (Connection conn = ConnectionFactory.getInstance().getConnection()) {
            if (conn != null) {
                System.out.println("Connection successful!");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        Scanner input = new Scanner(System.in);
        TreeSet<String> cnty = Counties.county;
        HashSet<String> ccda = Cicada.species;
        ArrayList<DateLocale> dateLocate = new ArrayList<DateLocale>();
        int user;

        do {
            System.out.println("\nWelcome to the Sound of Cicadas, a personal cicada sighting program.");
            System.out.println("Type the number for the option you want.");
            System.out.println("1. Create a new log" + "\n2. View previous logs" + "\n3. Exit\n");
            user = input.nextInt();
            input.nextLine();
            switch (user) {
                case 1:
                    boolean b = true;
                    while (b != false) {
                        LocalDateTime date = LocalDateTime.now();
                        System.out.println("\nTo create a new log, type the county where you made the sighting.\n");
                        String county = input.nextLine();
                            

                        System.out.println("\nNow enter the species of cicada that you have seen.\n");
                        String species = input.nextLine();


                        if (cnty.contains(county) && ccda.contains(species)) {
                            dateLocate.add(new DateLocale(date, county, species));
                            System.out.println("\nYou saw a " + species + " in " + county + " county on " + date + ".\n");
                            b = false;

                        } else {
                                System.out.println("\nPlease enter a valid combination of county and species. \nHere is the list of available counties:\n");
                                System.out.println(cnty);

                            }
                        
                    }
                    break;

                case 2:
                    System.out.println("\nHere is the list of previous logs that you have created:\n");
                    System.out.println(dateLocate);
                    break;

                case 3:
                    System.out.println("\nGoodluck and remember, we're all counting on you.");
                    break;

                default:
                    System.out.println("\nPlease input a valid choice.\n");
            }

        } while (user != 3);
        input.close();
    }

}
