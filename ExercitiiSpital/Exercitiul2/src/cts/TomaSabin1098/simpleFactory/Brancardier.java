package cts.TomaSabin1098.simpleFactory;

public class Brancardier extends PersonalSpital{
    protected Brancardier(String nume, double salariu, int varsta) {
        super(nume, salariu, varsta);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Brancardierul "+ super.getNume()+ " are salariul "+ super.getSalariu() + " si varsta "+ getVarsta());
    }
}
