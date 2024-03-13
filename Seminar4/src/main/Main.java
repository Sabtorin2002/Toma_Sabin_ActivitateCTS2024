package main;

import medicamente.MedicamentFactory;
import medicamente.Medicament;
import medicamente.TipMedicament;

public class Main {
    public static void main(String[] args) {
        Medicament med_1 = MedicamentFactory.getMedicament(TipMedicament.BODY, "Nivea", 20, 8);
        Medicament med_2 = MedicamentFactory.getMedicament(TipMedicament.RACEALA, "Paracetamol", 10, 1);
        Medicament med_3 = MedicamentFactory.getMedicament(TipMedicament.GRIPA, "Coldrex", 15, 2);
        med_1.afisareDetalii();
        med_2.afisareDetalii();
        med_3.afisareDetalii();
    }
}
