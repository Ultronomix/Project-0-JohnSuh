package com.github.project0;
import java.util.Scanner;

public class Body {

    public static void main(String[] args) {
        // CicadaList l = new CicadaList();
        Cicada list1 = new Cicada(null);
        Counties list2 = new Counties(null);

        list1.addSpecies("Cicadettana calliope calliope");
        list1.addSpecies("Southern Grass Cicada");
        list1.addSpecies("Diceroprocta vitripennis");
        list1.addSpecies("Green Winged Cicada");
        list1.addSpecies("Magicicada cassinii");
        list1.addSpecies("Cassini Periodical Cicaada");
        list1.addSpecies("17-Year Cicada");
        list1.addSpecies("Magicicada neotredecim Marshall and Cooley");
        list1.addSpecies("13 Periodical Cicada");
        list1.addSpecies("13-Year Cicada");
        list1.addSpecies("John and David's Cicada");
        list1.addSpecies("Magicicada septendecim");
        list1.addSpecies("Magicicada septendecim");
        list1.addSpecies("Linnaeus's 17-Year Cicada");
        list1.addSpecies("17-Year Cicada");
        list1.addSpecies("Magicicada septendecula");
        list1.addSpecies("Decula Periodical Cicdada");
        list1.addSpecies("17-Year Cicada");
        list1.addSpecies("Magicicada tredecassini");
        list1.addSpecies("13-Year Cicada");
        list1.addSpecies("13-Year Cassini");
        list1.addSpecies("Magicicada tredecim");
        list1.addSpecies("13-Year Cicada");
        list1.addSpecies("13-Year Decim");
        list1.addSpecies("Magicicada tredecula");
        list1.addSpecies("13-Year Cicada");
        list1.addSpecies("13-Year Decula");
        list1.addSpecies("Megatibicen auletes");
        list1.addSpecies("Northern Dusk Singing Cicada");
        list1.addSpecies("Megatibicen dorsatus");
        list1.addSpecies("Bush Cicada");
        list1.addSpecies("Grand Western");
        list1.addSpecies("Giant Grassland Cicada");
        list1.addSpecies("Megatibicen pronotalis walkeri");
        list1.addSpecies("Walker's Cicada");
        list1.addSpecies("Neocicada hieroglyphica hieroglyphica");
        list1.addSpecies("Hierogylphic Cicada");
        list1.addSpecies("Neotibicen canicularis");
        list1.addSpecies("Dog-day Cicada");
        list1.addSpecies("Neotibicen linnei");
        list1.addSpecies("Linne's Cicada");
        list1.addSpecies("Neotibicen lyricen engelhardti");
        list1.addSpecies("Dark Lyric Cicada");
        list1.addSpecies("Neotibicen lyricen lyricen");
        list1.addSpecies("Lyric Cicada");
        list1.addSpecies("Neotibicen pruinosus pruinosus");
        list1.addSpecies("Scissor Grinder");
        list1.addSpecies("Neotibicen tibicen tibicen");
        list1.addSpecies("Swamp Cicada");
        list1.addSpecies("Morning Cicada");
        list1.addSpecies("Okanagana balli");
        list1.addSpecies("Okanagana rimosa rimoasa");
        list1.addSpecies("Say's Cicada");

        list2.addCounty("Madison");
        list2.addCounty("Bond");
        list2.addCounty("Fayette");
        list2.addCounty("Effingham");
        list2.addCounty("Jasper");
        list2.addCounty("Crawford");
        list2.addCounty("Saint Clair");
        list2.addCounty("Clinton");
        list2.addCounty("Washington");
        list2.addCounty("Marion");
        list2.addCounty("Jefferson");
        list2.addCounty("Clay");
        list2.addCounty("Wayne");
        list2.addCounty("Richland");
        list2.addCounty("Lawrence");
        list2.addCounty("Edwards");
        list2.addCounty("Wabash");
        list2.addCounty("Monroe");
        list2.addCounty("Randolph");
        list2.addCounty("Perry");
        list2.addCounty("Franklin");
        list2.addCounty("Hamilton");
        list2.addCounty("White");
        list2.addCounty("Jackson");
        list2.addCounty("Williamson");
        list2.addCounty("Saline");
        list2.addCounty("Gallatin");
        list2.addCounty("Union");
        list2.addCounty("Johnson");
        list2.addCounty("Pope");
        list2.addCounty("Hardin");
        list2.addCounty("Alexander");
        list2.addCounty("Pulaski");
        list2.addCounty("Massac");

        System.out.println("Hello and welcome to the Cicada Tracker." + "\nPlease type the number of what you would like to do.");
        System.out.println("1. Log a sighting" + "\n2. Check your sightings" + "\n3. Exit");

        // System.out.println(list1.getListOfCicadas());
        // System.out.println(list2.getListOfCounties());
        // // System.out.println(l.getListOfCicadas());
    }
}
