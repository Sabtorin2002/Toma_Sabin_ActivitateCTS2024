package cts.TomaSabin1098.FactoryMethod;

public abstract class FabricaSupe {
    private String nume;
    private float pret;

    public FabricaSupe(String nume, float pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public float getPret() {
        return pret;
    }

    public abstract SupaAbstracta creareSupa();
}
