package com.github.project0.common.screens;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.BufferedReader;
import java.io.IOException;

import com.github.project0.Cicada;
import com.github.project0.Counties;
import com.github.project0.DateLocale;
import com.github.project0.common.datasource.ConnectionFactory;
import com.github.project0.common.util.AppContext;
import com.github.project0.users.UserLog;
import com.github.project0.users.UserLogDAO;

public class LogScreen extends AbstractScreen {

    static void DateLocale(String logDate, String county, String species) {
    }

    public LogScreen(BufferedReader input) {
        super("LogScreen", input);
    }

    TreeSet<String> cnty = Counties.county;
    HashSet<String> ccda = Cicada.species;
    ArrayList<DateLocale> dateLocate = new ArrayList<DateLocale>();

    @Override
    public void render() throws IOException {

        boolean a = true;
        while (a != false) {
        UserLog newLog = new UserLog();

        String second = "Please select from the following options:\n" +
                "1. Make a new log.\n" +
                "2. View past logs.\n" +
                "3. Exit to main menu.\n" +
                "4. Exit the application.\n" +
                "> ";

        System.out.print(second);

            switch (input.readLine()) {
                case "1":
                    boolean b = true;
                    while (b != false) {

                        System.out.print("To create a new log, enter the name of the county where you made the sighting.\n" +
                                "> ");
                        String county = input.readLine();

                        System.out.print("\nNow enter the species of cicada that you have seen.\n" +
                                "> ");
                        String species = input.readLine();

                        System.out.print("Now enter the date that you saw a cicada(mm.dd.yyyy).\n" +
                                "> ");
                        String logDate = input.readLine();

                        System.out.print(
                                "And finally, confirm that it is really you making a new entry and enter your username.\n"
                                        +
                                        "> ");
                        String username = input.readLine();

                        if (cnty.contains(county) && ccda.contains(species)) {
                            dateLocate.add(new DateLocale(logDate, county, species));
                            System.out.println("\nYou, " + username + ", saw a " + species + " in " + county
                                    + " county on " + logDate + ".\n");
                            newLog.setCounty(county);
                            newLog.setSpecies(species);
                            newLog.setLogDate(logDate);
                            newLog.setUsername(username);
                            b = false;

                        } else {
                            System.out.println(
                                    "\nPlease enter a valid combination of county and species. \nHere is the list of available counties:\n");
                            System.out.println(cnty);

                        }

                        UserLogDAO userLogDAO = new UserLogDAO();
                        String newUserLog = userLogDAO.save(newLog);

                    }
                    break;

                case "2":
                try (Connection conn = ConnectionFactory.getInstance().getConnection()) {

                    System.out.println("Please type your username to verify log identification:\n" +
                                          "> ");
                    String username = input.readLine();

                    System.out.println("Here are the logs you have created during this session:\n");
                    System.out.println(dateLocate + "\n");
                    System.out.println("And here are all of the previous logs you have created:\n");

                    String sql = "SELECT * FROM logs " +
                    "WHERE username = " + "'" + username + "'";

                    Statement stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery(sql);

                    while(rs.next()) {
                        System.out.println(rs.getString("log_date"));
                        System.out.println(rs.getString("county"));
                        System.out.println(rs.getString("species"));
                        System.out.println();
                    }

                } catch (SQLException e) {
                    System.err.println("Bad things are happening.");
                    e.printStackTrace();
                }
                    break;

                case "3":
                    System.out.println("See you next time!\n");
                    new WelcomeScreen(input).render();
                    a = false;
                    break;

                case "4":
                    System.out.println("Goodluck and remember, we're all counting on you.\n");
                    AppContext.shutdown();
                    a = false;
                    break;

                default:
                    System.out.println("\nPlease input a valid choice.\n");
            }
        }
    }

}
