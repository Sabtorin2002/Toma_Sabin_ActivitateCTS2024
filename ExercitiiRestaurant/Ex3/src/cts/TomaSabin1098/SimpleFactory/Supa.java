package cts.TomaSabin1098.SimpleFactory;

public abstract class Supa {
    private String nume;
    private float pret;

    public Supa(String nume, float pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public float getPret() {
        return pret;
    }
    public abstract void afisareDetalii();
}
