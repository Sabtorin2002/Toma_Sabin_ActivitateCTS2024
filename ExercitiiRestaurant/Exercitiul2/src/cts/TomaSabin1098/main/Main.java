package cts.TomaSabin1098.main;

import cts.TomaSabin1098.Builder.AbstractBuilder;
import cts.TomaSabin1098.Builder.Rezervare;

public class Main {
    public static void main(String[] args) {
        AbstractBuilder abstractBuilder = new Rezervare.RezervareBuilder();
        Rezervare rezervare1=abstractBuilder.asezareGeam().masaDecorata().build();
        Rezervare rezervare2=abstractBuilder.muzicaAmbientala().genMuzical("Jazz").build();

        System.out.println(rezervare1);
        System.out.println(rezervare2);

        AbstractBuilder abstractBuilder1 = new Rezervare.RezervareBuilder();
        Rezervare rezervare3=abstractBuilder1.masaDecorata().masaDecorata().build();

        System.out.println(rezervare3);

    }
}