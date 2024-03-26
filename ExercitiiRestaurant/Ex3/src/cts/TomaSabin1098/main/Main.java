package cts.TomaSabin1098.main;

import cts.TomaSabin1098.SimpleFactory.Supa;
import cts.TomaSabin1098.SimpleFactory.SupaFactory;
import cts.TomaSabin1098.SimpleFactory.TipSupa;

public class Main {
    public static void main(String[] args) {
        Supa supa1 = SupaFactory.getSupa(TipSupa.VITA,"vita",27);
        Supa supa2= SupaFactory.getSupa(TipSupa.CIUPERCI,"ciuperci",23);
        Supa supa3 = SupaFactory.getSupa(TipSupa.LEGUME,"legume",17);

        supa3.afisareDetalii();
        supa2.afisareDetalii();
        supa1.afisareDetalii();
    }
}