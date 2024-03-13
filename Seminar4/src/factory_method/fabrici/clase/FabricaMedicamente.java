package factory_method.fabrici.clase;

public abstract class FabricaMedicamente {
    private String denumire;
    private float pret;

    public FabricaMedicamente(String denumire, float pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    public String getDenumire() {
        return denumire;
    }

    public float getPret() {
        return pret;
    }

    public abstract Medicament creareMedicament();
}
