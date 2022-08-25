package com.github.project0;

public class DateLocale extends Logs {
    private int date;
    private String county;
    private String species;

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    String countyName() {
        return county;
    }

    @Override
    String speciesName() {
        return species; 
    }
}
