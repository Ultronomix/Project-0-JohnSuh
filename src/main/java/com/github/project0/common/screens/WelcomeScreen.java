package com.github.project0.common.screens;

import java.io.BufferedReader;

import com.github.project0.common.util.AppContext;

import java.io.IOException;

public class WelcomeScreen extends AbstractScreen {

    public WelcomeScreen(BufferedReader input) {
        super("WelcomeScreen", input);
    }

    public void render() throws IOException {
        String first = "Welcome to the Sound of Cicadas, a personal cicada sighting program.\n" +
                       "Type the number for the option you want.\n" +
                       "1. Register\n" + "2. Login\n" + "3. Exit\n" +
                       "> ";

        System.out.print(first);

        String userSelection = input.readLine();
    
        switch (userSelection) {
            case "1":
                new RegisterScreen(input).render();
                break;
            case "2":
                new LoginScreen(input).render();
                break;
            case "3":
                System.out.println("Goodbye!");
                AppContext.shutdown();
                break;
            default:
                System.out.println("Please select a correct option");
        }
    }
}