package cts.TomaSabin1098.simpleFactory;

public class Asistent extends PersonalSpital{
    protected Asistent(String nume, double salariu, int varsta) {
        super(nume, salariu, varsta);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Asistentul "+ super.getNume()+ " are salariul "+ super.getSalariu() + " si varsta "+ getVarsta());
    }
}
