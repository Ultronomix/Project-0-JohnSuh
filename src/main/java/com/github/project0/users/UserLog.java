package com.github.project0.users;

import java.util.Objects;

public class UserLog {

    private String logDate;
    private String county;
    private String species;
    private String username;

    
    public String getLogDate() {
        return logDate;
    }
    public void setLogDate(String logDate) {
        this.logDate = logDate;
    }

    public String getCounty() {
        return county;
    }
    public void setCounty(String county) {
        this.county = county;
    }

    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserLog userLog = (UserLog) o;
        return Objects.equals(logDate, userLog.logDate) && Objects.equals(county, userLog.county) && Objects.equals(species, userLog.species) && Objects.equals(username, userLog.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logDate, county, species, username);
    }

    @Override
    public String toString() {
        return "UserLog{" +
        "logDate='" + logDate + '\'' +
        ", county='" + county + '\'' +
        ", species='" + species + '\'' +
        "idLog='" + username + '\'' +
        '}';
    }
    
}
