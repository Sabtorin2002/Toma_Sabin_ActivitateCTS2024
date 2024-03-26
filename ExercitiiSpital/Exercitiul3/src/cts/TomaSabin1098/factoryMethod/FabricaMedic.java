package cts.TomaSabin1098.factoryMethod;

import java.util.List;

public class FabricaMedic extends FabricaPersonal {
    public FabricaMedic(String nume, List<String> listaPacienti, int nrPacienti) {
        super(nume, listaPacienti, nrPacienti);
    }

    @Override
    public PersonalSpital crearePersonal() {
        return new Medic(super.getNume(),super.getListaPacienti(),super.getNrPacienti());
    }
}
