package cts.TomaSabin1098.main;

import cts.TomaSabin1098.builder.AbstractBuilder;
import cts.TomaSabin1098.builder.Pacient;

public class Main {
    public static void main(String[] args) {
        AbstractBuilder abstractBuilder = new Pacient.PacientBuilder();
        Pacient pacient1=abstractBuilder.adaugaHalatInterior().adaugaMicDejun().build();
        Pacient pacient2=abstractBuilder.adaugaPatRabatibil().build();

        System.out.println(pacient1);
        System.out.println(pacient2);

        AbstractBuilder abstractBuilder1 = new Pacient.PacientBuilder();
        Pacient pacient3 = abstractBuilder1.adaugaPapuciCamera().build();
        System.out.println(pacient3);
    }
}