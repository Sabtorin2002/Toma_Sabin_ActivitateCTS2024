package cts.TomaSabin1098.main;

import cts.TomaSabin1098.FactoryMethod.*;

public class Main {
    public static void main(String[] args) {
        FabricaSupe fabricaSupaVita = new FabricaSupaVita("vita",22);
        SupaAbstracta supaVita = fabricaSupaVita.creareSupa();

        FabricaSupe fabricaSupaLegume = new FabricaSupaLegume("legume",15);
        SupaAbstracta supaLegume = fabricaSupaLegume.creareSupa();

        FabricaSupe fabricaCiuperci = new FabricaSupaCiuperci("ciuperci",18);
        SupaAbstracta supaCiuperci = fabricaCiuperci.creareSupa();

        supaVita.afisareDetalii();
        supaCiuperci.afisareDetalii();
        supaLegume.afisareDetalii();
    }
}