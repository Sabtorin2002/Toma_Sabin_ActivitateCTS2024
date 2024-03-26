package cts.TomaSabin1098.main;

import cts.TomaSabin1098.singleton.Spital.Medic;

public class Main {
    public static void main(String[] args) {
        Medic medic1=Medic.getInstance();
        Medic medic2=Medic.getInstance("Pavel",16500,44);

        System.out.println(medic2);
    }
}