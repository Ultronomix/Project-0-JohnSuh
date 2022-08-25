package com.github.project0;
import java.util.HashSet;
import java.util.Set;

public class Counties {

    private final Set<String> listOfCounties;
    private final String county;

    public Counties(String county) {
        this.county = county;
        this.listOfCounties = new HashSet<>();
    }

    public String getCounty() {
        return county;
    }

    public Set<String> getListOfCounties() {
        return listOfCounties;
    }

    public void addCounty(String county) {
        listOfCounties.add(county);
    }

    String ci = "Madison";
    String cii = "Bond";
    String ciii = "Fayette";
    String c4 = "Effingham";
    String c5 = "Jasper";
    String c6 = "Crawford";
    String c7 = "Saint Clair";
    String c8 = "Clinton";
    String c9 = "Washington";
    String c10 = "Marion";
    String c11 = "Jefferson";
    String c12 = "Clay";
    String c13 = "Wayne";
    String c14 = "Richland";
    String c15 = "Lawrence";
    String c16 = "Edwards";
    String c17 = "Wabash";
    String c18 = "Monroe";
    String c19 = "Randolph";
    String c20 = "Perry";
    String c21 = "Franklin";
    String c22 = "Hamilton";
    String c23 = "White";
    String c24 = "Jackson";
    String c25 = "Williamson";
    String c26 = "Saline";
    String c27 = "Gallatin";
    String c28 = "Union";
    String c29 = "Johnson";
    String c30 = "Pope";
    String c31 = "Hardin";
    String c32 = "Alexander";
    String c33 = "Pulaski";
    String c34 = "Massac";

}
