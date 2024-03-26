package cts.TomaSabin1098.Horeca.Main;

import cts.TomaSabin1098.Horeca.SupaRegistry;

public class Main {
    public static void main(String[] args) {
        SupaRegistry registru = SupaRegistry.getInstance();
        registru.inregistreazaSupa("Acquarello","SupaVita",32);
        registru.inregistreazaSupa("Teatris","SupaLegume",21);

        System.out.println(registru.getSupa("Teatris"));
    }
}
