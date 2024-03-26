package cts.TomaSabin1098.FactoryMethod;

public abstract class SupaAbstracta {
    private String denumire;
    private float pret;

    public SupaAbstracta(String denumire, float pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    public String getDenumire() {
        return denumire;
    }

    public float getPret() {
        return pret;
    }

    public abstract void afisareDetalii();
}
