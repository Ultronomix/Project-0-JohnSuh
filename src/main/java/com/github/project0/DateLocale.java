package com.github.project0;

public class DateLocale extends Logs {

    private String logDate;
    private String county;
    private String species;

    public DateLocale (String logDate, String county, String species){
        this.logDate = logDate;
        this.county = county;
        this.species = species;
    }

    @Override
    String countyName() {
        return county;
    }

    @Override
    String speciesName() {
        return species;
    }
    public String toString() {
        return "You saw a " + species + " in " + county + " county on " + logDate + ".";
    }
}
