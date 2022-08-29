package com.github.project0.common.screens;

import java.io.BufferedReader;

public abstract class AbstractScreen implements Screens {

    protected String name;
    protected BufferedReader input;

    public AbstractScreen(String name, BufferedReader input) {
        this.name = name;
        this.input = input;
    }

    public String getName() {
        return name;
    }
}
