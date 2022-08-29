package com.github.project0.common.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.github.project0.common.screens.Screens;
import com.github.project0.common.screens.WelcomeScreen;

public class AppContext {

    private static boolean appRunning;

    private BufferedReader input;

    public AppContext() {
        appRunning = true;
        input = new BufferedReader(new InputStreamReader(System.in));

    }


    public void startApp() {
        while (appRunning) {
            try {
                Screens currentScreen = new WelcomeScreen(input);
                currentScreen.render();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void shutdown() {
        appRunning = false;
    }
    
}
