package cts.TomaSabin1098.main;

import cts.TomaSabin1098.Singleton.Supa;

public class Main {
    public static void main(String[] args) {
        Supa supa = Supa.getInstance();
        Supa supa1 = Supa.getInstance();

        System.out.println(supa1);
        System.out.println(supa);
    }
}