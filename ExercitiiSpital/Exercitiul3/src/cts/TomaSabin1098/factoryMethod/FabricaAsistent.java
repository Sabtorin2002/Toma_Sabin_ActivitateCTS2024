package cts.TomaSabin1098.factoryMethod;

import java.util.List;

public class FabricaAsistent extends FabricaPersonal {
    public FabricaAsistent(String nume, List<String> listaPacienti, int nrPacienti) {
        super(nume, listaPacienti, nrPacienti);
    }

    @Override
    public PersonalSpital crearePersonal() {
        return new Asistent(super.getNume(),super.getListaPacienti(),super.getNrPacienti());
    }
}
