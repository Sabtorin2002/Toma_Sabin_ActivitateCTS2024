package Builder.MainBuilder;

import Builder.Rezervare;
import Builder.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        RezervareBuilder rezervareBuilder = new RezervareBuilder();
        Rezervare rezervare = rezervareBuilder.adaugaMancare().adaugaBautura().build();

        Rezervare rezervare2=rezervareBuilder.adaugaMuzica().adaugaGenMuzical("Rock").build();

        System.out.println(rezervare);
        System.out.println(rezervare2);
    }
}