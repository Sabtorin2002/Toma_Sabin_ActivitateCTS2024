package medicamente;

public abstract class Medicament {
    private String denumire;
    private float pret;

    public String getDenumire() {
        return denumire;
    }
    public float getPret() {
        return pret;
    }

    public Medicament(String denumire, float pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    public abstract void afisareDetalii();
}
