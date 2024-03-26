package cts.TomaSabin1098.main;

import cts.TomaSabin1098.simpleFactory.PersonalFactory;
import cts.TomaSabin1098.simpleFactory.PersonalSpital;
import cts.TomaSabin1098.simpleFactory.TipPersonal;

public class Main {
    public static void main(String[] args) {
        PersonalSpital personalSpital1 = PersonalFactory.getPersonal(TipPersonal.MEDIC,"Ivan",15000,38,2);
        PersonalSpital personalSpital2 = PersonalFactory.getPersonal(TipPersonal.BRANCARDIER,"Catalin",5000,42,3);
        PersonalSpital personalSpital3 = PersonalFactory.getPersonal(TipPersonal.ASISTENT,"Georgeta",5200,46,15);

        personalSpital1.afisareDetalii();
        personalSpital2.afisareDetalii();
        personalSpital3.afisareDetalii();
    }
}
