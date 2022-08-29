package com.github.project0.common.screens;

import java.io.BufferedReader;
import java.io.IOException;

public class LoginScreen extends AbstractScreen {

    public LoginScreen(BufferedReader input) {
        super("LoginScreen", input);
    }

    public void render() throws IOException {
        System.out.println("Login screen works!");
    }
    
}
