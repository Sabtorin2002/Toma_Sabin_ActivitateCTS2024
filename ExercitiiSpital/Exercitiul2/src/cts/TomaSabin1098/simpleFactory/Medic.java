package cts.TomaSabin1098.simpleFactory;

public class Medic extends PersonalSpital{
    private int nrSubordonati;
    protected Medic(String nume, double salariu, int varsta) {
        super(nume, salariu, varsta);
        this.nrSubordonati=0;
    }

    public Medic(String nume, double salariu, int varsta, int nrSubordonati) {
        super(nume, salariu, varsta);
        this.nrSubordonati = nrSubordonati;
    }

    public int getNrSubordonati() {
        return nrSubordonati;
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Medicul "+ super.getNume()+ " are salariul "+ super.getSalariu() + " si varsta "+ getVarsta()+
                "."+super.getNume()+" va avea "+ getNrSubordonati() +" subordonati.");
    }
}
