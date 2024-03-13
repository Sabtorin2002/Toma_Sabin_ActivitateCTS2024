package factory_method.main;

import factory_method.fabrici.clase.*;

public class Main {
    public static void main(String[] args) {
        FabricaMedicamente fabricaRaceala = new FabricaRaceala("Paracetamol", 10);
        Medicament med_1 = fabricaRaceala.creareMedicament();
        FabricaMedicamente fabricaDurere = new FabricaDurere("Ibuprofen", 15);
        Medicament med_2 = fabricaDurere.creareMedicament();
        FabricaGripa fabricaGripa = new FabricaGripa("Aspirina", 20);
        Medicament med_3 = fabricaGripa.creareMedicament();
        System.out.println(med_1.afisareDetalii());
        System.out.println(med_2.afisareDetalii());
        System.out.println(med_3.afisareDetalii());

        FabricaMedicamente fabricaMedicamente = new FabricaRaceala("Paracetamol", 10);
        procesareMedicament(fabricaMedicamente);
        fabricaMedicamente = new FabricaGripa("Aspirina", 20);
        procesareMedicament(fabricaMedicamente);

    }

    public static void procesareMedicament(FabricaMedicamente fabricaMedicamente)
    {
        Medicament med = fabricaMedicamente.creareMedicament();
        System.out.println(med.afisareDetalii());
    }
}
