package cts.TomaSabin1098.Poli.main;

import cts.TomaSabin1098.Poli.MedicRegistry;

public class Main {
    public static void main(String[] args) {

        MedicRegistry registru = MedicRegistry.getInstance();
        registru.inregistreazaMedic("Coltea","Avram",16700);
        registru.inregistreazaMedic("BoliInfectioase","Vlad",20000);

        System.out.println(registru.getMedic("Coltea"));

    }
}
