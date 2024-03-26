package cts.TomaSabin1098.factoryMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class FabricaPersonal {
    private String nume;
    private List<String> listaPacienti = new ArrayList<>();
    private int nrPacienti;

    protected FabricaPersonal(String nume, List<String> listaPacienti, int nrPacienti) {
        this.nume = nume;
        this.listaPacienti = listaPacienti;
        this.nrPacienti = nrPacienti;
    }

    public String getNume() {
        return nume;
    }

    public List<String> getListaPacienti() {
        return listaPacienti;
    }

    public int getNrPacienti() {
        return nrPacienti;
    }

    public abstract PersonalSpital crearePersonal();
}
