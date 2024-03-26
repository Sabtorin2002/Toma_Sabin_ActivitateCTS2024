package cts.TomaSabin1098.simpleFactory;

public abstract class PersonalSpital {
    private String nume;
    private double salariu;
    private int varsta;

    protected PersonalSpital(String nume, double salariu, int varsta) {
        this.nume = nume;
        this.salariu = salariu;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public double getSalariu() {
        return salariu;
    }

    public int getVarsta() {
        return varsta;
    }

    public abstract void afisareDetalii();
}
