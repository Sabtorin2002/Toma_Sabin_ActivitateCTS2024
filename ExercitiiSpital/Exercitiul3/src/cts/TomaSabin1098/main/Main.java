package cts.TomaSabin1098.main;

import cts.TomaSabin1098.factoryMethod.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> pacienti = new ArrayList<>();
        pacienti.add("Popa");
        pacienti.add("Ionescu");
        pacienti.add("Nagy");
        FabricaPersonal fabricaAsistent = new FabricaAsistent("Ivan",pacienti,3);
        PersonalSpital personal1 = fabricaAsistent.crearePersonal();

        FabricaPersonal fabricaMedic = new FabricaMedic("Ecaterina",pacienti,3);
        PersonalSpital personalSpital2 = fabricaMedic.crearePersonal();

        FabricaPersonal fabricaBrancardier = new FabricaBrancardier("Laurentiu",pacienti,3);
        PersonalSpital personalSpital3 = fabricaBrancardier.crearePersonal();

        personal1.afisareDetalii();
        personalSpital2.afisareDetalii();
        personalSpital3.afisareDetalii();
    }
}