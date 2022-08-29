package com.github.project0.common.screens;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import com.github.project0.users.User;
import com.github.project0.users.UserDAO;

public class RegisterScreen extends AbstractScreen {

    private final String RED_TEXT = "\u001B[31m";
    private final String RESET_TEXT = "\u001B[0m";

    public RegisterScreen(BufferedReader input) {
        super("RegisterScreen", input);
    }

    @Override
    public void render() throws IOException {
        System.out.println("Please provide information to register an accoutn");


        User newUser = new User();

        boolean formComplete = false;
        while (!formComplete) {

            System.out.print("Given name > (must not be empty)");
            String givenName = input.readLine();
            if (givenName == null || givenName.trim().equals("")) {
                System.out.println(RED_TEXT + "Invalid given name provided. Returning to top of form." + RESET_TEXT);
                continue;
            }

            newUser.setGivenName(givenName);

            System.out.print("Username > (must be unique and at least 4 characters)");
            String username = input.readLine();
            if (username == null || username.trim().length() < 4) {
                System.out.println(RED_TEXT + "Invalid username provided. Returning to top of form." + RESET_TEXT);
                continue;
            }

            newUser.setUsername(username);

            System.out.print("Email address > (must be unique)");
            String email = input.readLine();
            if (email == null || email.trim().equals("") || !email.contains("@")) {
                System.out.println(RED_TEXT + "Invalid email address provided. Returning to top of form." + RESET_TEXT);
                continue;
            }

            newUser.setEmail(email);

            System.out.print("Password > (must be at least 8 characters)");
            String password = input.readLine();
            if (givenName == null || givenName.trim().length() < 8) {
                System.out.println(RED_TEXT + "Invalid password provided. Returning to top of form." + RESET_TEXT);
                continue;
            }

            newUser.setPassword(password);

            formComplete = true;

        }

        UserDAO userDAO = new UserDAO();
        String newUserId = userDAO.save(newUser);

        System.out.print("User successfully persisted! Generated id: " + newUserId);

    }

}
