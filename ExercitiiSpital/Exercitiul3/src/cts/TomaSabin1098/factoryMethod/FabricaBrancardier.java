package cts.TomaSabin1098.factoryMethod;


import java.util.List;

public class FabricaBrancardier extends FabricaPersonal {
    public FabricaBrancardier(String nume, List<String> listaPacienti, int nrPacienti) {
        super(nume, listaPacienti, nrPacienti);
    }

    @Override
    public PersonalSpital crearePersonal() {
        return new Brancardier(super.getNume(),super.getListaPacienti(),super.getNrPacienti());
    }
}
