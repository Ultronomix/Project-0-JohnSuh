package com.github.project0.common.screens;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.github.project0.common.datasource.ConnectionFactory;

public class LoginScreen extends AbstractScreen {

    private final String RED_TEXT = "\u001B[31m";
    private final String RESET_TEXT = "\u001B[0m";

    public LoginScreen(BufferedReader input) {
        super("LoginScreen", input);
    }

    public void render() {

        try (Connection conn = ConnectionFactory.getInstance().getConnection()) {

            boolean loginComplete = false;
            while (!loginComplete) {
                System.out.print("Please provide your username:" +
                        "> ");
                String username = input.readLine();

                String sqlU = "SELECT username, password FROM cicada_users";

                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sqlU);

                if (rs.next()) {
                    String usernameLoop = rs.getString("username");
                    if (!usernameLoop.equals(username)) {
                        System.out.print(RED_TEXT + "Invalid Username." + RESET_TEXT);
                        continue;
                    }
                }

                System.out.print("Please provide your password:" +
                        "> ");
                String password = input.readLine();

                String passwordLoop = rs.getString("password");
                if (!passwordLoop.equals(password)) {
                    System.out.print(RED_TEXT + "Invalid Password.\n" + RESET_TEXT);
                    continue;
                } else {
                    System.out.print("Login successful!\n");
                    loginComplete = true;
                    new LogScreen(input).render();
                }

            }
        } catch (SQLException e) {
            System.err.println("Bad things are happening.");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
