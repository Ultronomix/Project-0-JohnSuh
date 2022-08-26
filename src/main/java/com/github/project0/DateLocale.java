package com.github.project0;
import java.time.LocalDateTime;

public class DateLocale extends Logs {
    private LocalDateTime date;
    private String county;
    private String species;

    DateLocale (LocalDateTime date, String county, String species){
        this.date = date;
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
        return "You saw a " + species + " in " + county + " county on " + date + ".";
    }
}
